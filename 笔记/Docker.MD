## 查看内核
```shell
[root@centos ~]# cat /etc/redhat-release 
CentOS Linux release 7.9.2009 (Core)
[root@centos ~]# uname -r
3.10.0-1160.el7.x86_64
```
##centos 防火墙
```shell
#查看开发端口
firewall-cmd --list-ports
#开放端口
firewall-cmd --zone=public --add-port=8080/tcp --permanent
#–zone  #作用域
#–add-port=80/tcp  #添加端口，格式为：端口/通讯协议
#–permanent  #永久生效，没有此参数重启后失效
#重启防火墙
firewall-cmd --reload
#停止
systemctl stop firewall.service
#禁止启动
systemctl disable firewall.service
```


##docker 
###基本组成
+ 镜像 image
```shell
只读的模板，镜像可以用来插件docker容器，一个镜像可以创建多个容器  
docker镜像文件类似于Java的类模板，而docker容器实例类似于java中new出来的实例对象
```
+ 容器 container *简易版linux*
```shell
容器是镜像创建的运行实例
```
+ 仓库 repository 
> 最大公开库 https://hub.docker.com/search?q=mysql

### 运行流程
1. 用户使用docker client 与docker daemon(守护进程) 建立通讯，并发送请求给后者
2. docker daemon(守护进程)主体，提供docker service的功能使其可以接受client的请求
3. docker engine(引擎)执行内部一系列工作，每一项都以job的形式存在
4. job的运行过程中，需要镜像时，registry(注册信息)获取信息，管理驱动 graph driver 下载以graph的形式存储
5. 创建网络通过network driver创建并管理docker容器的网络
6. exec driver执行用户指令

### 安装与卸载docker
1.  官方一键安装 https://github.com/docker/docker-install
```shell
## docker官网下载安装
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh

## 使用阿里云的安装
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh --mirror=Aliyun

## 其他方式安装
yun install -y yum-utils
。。。。。

```
2. 设置相关
```shell
#开机启动
systemctl enable docker

# 设置阿里仓库
cat > /etc/docker/daemon.json << EOF
{
"registry-mirrors": ["https://b9pmyelo.mirror.aliyuncs.com"]
}
EOF
# 重新加载配置
systemctl daemon-reload
## 重启
systemctl restart docker
```

### docker常用命令
#### 帮助命令
```shell
#启动
systemctl start docker
#停止
systemctl stop docker
#重启
systemctl restart docker
#查看状态
systemctl status docker
#开机自启动
systemctl enable docker
#查看信息
docker info
```

#### 镜像命令
```shell
#列出本机上的镜像
docker images  -a 所有镜像 -q 只显示镜像id
docker search XXX 搜索镜像名XXX 
docker search XXX --limit 5 显示搜索的5个
docker pull XXX:TAG 下载XXX TAG指定版本
docker system df 查看所有镜像/容器/数据卷所占的空间
docker rmi -f 镜像id1 镜像id2  #删除镜像id1 镜像id2
docker rmi -f $(docker images -aq) #删除所有镜像
```

#### 容器命令
```shell
docker run [options] image [command] [tag]
>[options] 有些[-] 或者[--]
--name='容器新名称'
-d 后台运行容器并返回容器id
-it 交互模式运行 等待交互  ## docker run -it centos /bin/bash 
-P 随机端口 
-p 指定端口 -p 本机端口：容器端口
#退出容器
exit 
ctrl+p+q 
docker start 容器id或者名称 ##启动已经停止的容器
docker restart 容器id或者名称 ##重启容器
docker stop 容器id或者名称 ##停止容器
docker kill 容器id或者名称 ##强制停止容器
docker rm 容器id ### 删除容器
docker rm -f $(docker ps -aq) ##删除所以容器
docker logs 容器id ###容器日志
docker inspect 容器id ###容器内部细节
docker exec -it 容器id /bin/bash 
##重新进入容器
docker attach 容器id ## 不会启动新的进程
docker exec 容器id ##新的进程
docker cp 容器id：容器路劲 主机路劲 ## 复制容器内文件到主机
docker export 容器id > 文件名.tar ##导出
cat 文件名.tar | docker import - 镜像用户/镜像名称：版本号  ##导出

docker commit -m='提交描述信息' -a='作者' 容器id 要创建的目标容器名称：版本 

```
#### 容器数据卷
-- privileged=true 
######将主机目录挂载到容器目录中
docker run -it --privileged=true -v /主机目录：/容器目录 镜像名
容器2继承容器1的卷规则
docker run -it --privileged=true--volumes-from--name u2 ubuntu

###docker安装nginx
+ docker images #查看本地
+ docker run -d --name nginx01 -p 3344:80 nginx # 后台方式启动启动镜像
+ curl localhost:3344 #本地访问测试
+ docker exec  -it nginx01 /bin/bash #进入容器
+ whereis nginx 查看安装位置
###docker安装tomcat
+ docker pull tomcat #下载
+ docker run -d -p 3344:8080 --name tomcat01 tomcat
+ docker exec -it tomcat01 /bin/bash #进入容器
###docker部署es+kibana
> es 暴露的端口很多    
> es 十分的耗内存 
> es 的数据一般需要放置到安全目录！ 挂载  
> --net somenetwork 网络配置    
+ docker run -d 
  + --name elasticsearch 
  + --net somentword 9200:9200 
  + -p 9300:9300
  + -e "discovery.type=single-node"
  + -e ES_JAVA_OPTS="-Xms64m -Xmx512m"
  + elasticsearch:7.6.2 #启动elasticsearch
###可视化poerainer
docker run -d -p 8088:9000 --restart=always -v /var/run/docker.sock:/var/run/docker.sock --privileged=true portainer/portainer

### commit镜像
> docker commit 提交容器成为一个新的版本
>> docker commit -a="xiaofeng" -m="commit message" 容器id 目标镜像名：[TAG]


### 容器数据卷
方式一：直接使用命令来挂载 -v
docker run -it -v 主机目录：容器目录
>>docker run -it -v /home/ceshi:/home centos /bin/bash
#### 测试安装mysql 
> docker pull mysql:5.7
> docker run -d
-p 3344:3306
-v /home/mysql/conf:/etc/mysql/conf.d 
-v /home/mysqldata:/var/lib/mysqldata
-e MYSQL_ROOR_PASSWORD=12345
--name mysql01
mysql:5.7
###匿名和具名挂载
docker run -d -P --name nginx01 -v /etc/nginx nginx
### -P 随机指定端口
#### 如何确定是具名挂载还是匿名挂载，还是指定路径挂载！
-v  容器内路径                   # 匿名挂载
-v  卷名:容器内路径               # 具名挂载
-v /主机路径:容器内路径            # 指定路径挂载
 

##DockerFile
```
# 创建一个dockerfile文件， 名字可以随机
# 文件的内容 指定（大写） 参数
FORM centos
VOLUME ["NAME1","NAME2"]
CMD echo "hello--end"
CMD /bin/bash
```
docker build -f dockerfile1 -t xiaofan/centos:1.0
+ 编写dockerfile文件
+ docker build 构建镜像
+ docker run 运行镜像
+ docker push 发布镜像

FROM            # 基础镜像，一切从这里开始构建        
MAINTAINER      # 镜像是谁写的， 姓名+邮箱     
RUN             # 镜像构建的时候需要运行的命令        
ADD             # 步骤， tomcat镜像， 这个tomcat压缩包！添加内容        
WORKDIR         # 镜像的工作目录       
VOLUME          # 挂载的目录     
EXPOSE          # 保留端口配置    
CMD             # 指定这个容器启动的时候要运行的命令，只有最后一个会生效可被替代       
ENTRYPOINT      # 指定这个容器启动的时候要运行的命令， 可以追加命令     
ONBUILD         # 当构建一个被继承DockerFile 这个时候就会运行 ONBUILD 的指令，触发指令      
COPY            # 类似ADD, 将我们文件拷贝到镜像中    
ENV             # 构建的时候设置环境变量   

### 创建一个自己的centos
>> cat mydockerfile-centos
FROM centos
MAINTAINER pengjian@qq.com


ENV MYPATH /usr/local
WORKDIR $MYPATH
RUN yum -y install vim
RUN yum -y install net-tools

EXPOSE 80

CMD echo $MYPATH
CMD echo "--end--"
CMD /bin/bash

>> docker build -f mydockerfile-centos -t mycentos:0.1

##docker网络
清空测试数据
清空正在运行的容器
docker kill $(docker ps -aq) 
删除已停止的容器
docker rm -f $(docker ps -aq)
删除所有镜像
docker rmi -f $(docker ps -aq)




