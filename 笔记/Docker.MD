
###docker 开源 GO语言开发
```
+ 虚拟机：虚拟一台或多台电脑，笨重
+ 容器： 隔离，镜像 轻巧

镜像（image）==模板  
    tomcat镜像 ==》run==>tomcat01容器提供服务
容器（container）==通过镜像创建 简易的linux系统
    启动，停止，删除，基本命令
仓库（repository）
    docker hub 国外
    阿里云配置
    sudo mkdir -p /etc/docker
    sudo tee /etc/docker/daemon.json <<- 'EOF'
    {
      "registry-mirrors": ["https://pi9dpp60.mirror.aliyuncs.com"]
    }
    EOF
    sudo systemctl daemon-reload
    sudo systemctl restart docker
```
### 安装docker
官方一键安装
> curl -fsSL https://get.docker.com | bash -s docker --mirror Aliyun                
国内 daocloud一键安装命令        
> curl -sSL https://get.daocloud.io/docker | sh
手动安装：卸载、设置仓库、安装
+ yum remove  docker \
  docker-client \
  docker-client-latest \
  docker-common \
  docker-latest \
  docker-latest-logrotate \
  docker-logrotate \
  docker-selinux \
  docker-engine-selinux \
  docker-engine \
  docker-ce
仓库
+ $ sudo yum install -y yum-utils \
  device-mapper-persistent-data \
  lvm2
  $ sudo yum-config-manager \
  --add-repo \
  https://download.docker.com/linux/centos/docker-ce.repo
安装
+ sudo yum install -y docker-ce docker-ce-cli containerd.io
+ yum install -y docker-ce
测试
docker run hello-word
  若结果显示“docker: Cannot connect to the Docker daemon at unix:///var/run/docker.sock. Is the docker daemon running?”,则运行如下命令：
systemctl daemon-reload
systemctl restart docker.service
再次验证
docker run hello-world

开机启动
systemctl enable docker





### 基本命令
> docker version  ```版本信息```    
> docker info  ```docker 系统信息```    
> docker 命令 --help
### 镜像命令
> docker images ```查看所有本地主机上的镜像```
> > docker images -a 所有镜像
> > docker images -q 只显示镜像id
> 
> docker search ```搜索镜像```
> > docker search mysql --filter=STARS=3000   搜素出来的镜像就是STARS大于3000的
> 
> docker pull ```下载镜像```
> > docker pull mysql 下载最新  
> > docker pull mysql:5.7  指定版本
> > docker images 查看本地镜像
> 
> docker rmi ```删除镜像```
> > docker rmi -f 镜像id 镜像id2 镜像id3
> > docker rmi -f $(docker images -aq) 删除所有
###容器命令
> docker pull centos 拉取centos
> docker run xxx 新建容器并启动
> 参数 
> --name 容器名称
> -d 后台运行
> -it 交互式运行
> -p 8080:8080
> > docker rum -it centos /bin/bash 启动并进入容器
> > exit 从容器中退回主机   
> 
> docker ps ```列出所有的运行的容器```
>> docker ps -a 正在运行的容器
>> docker ps -n=2 前2个容器
>> docker ps -q 显示当前容器的编号

### 退出器
> exit 直接退出容器并关闭
> Ctrl+P+Q 容器不关闭退出
### 删除容器
> docker rm -f 容器id     删除指定id
> docker rm -f $(docker ps -aq) 删除所有
> docker ps -a -q |xargs docker rm -f
### 启动停止容器
> docker start 容器id
> docker resart 容器id
> docker stop 容器id
> docker kill 容器id
> docker run -d centos 后台启动容器
>### 日志
> docker logs -tf --tail number 容器id
> 
###进入当前运行的容器
> docker exec -it 容器id /bin/bash
> docker attach 容器id
### 从容器拷贝文件到主机
> docker cp 容器id：容器内路径  目的地主机路径
>> docker cp 7af535f807e0:/home/test.java /myhome
> 
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
# -P 随机指定端口
# 如何确定是具名挂载还是匿名挂载，还是指定路径挂载！
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


