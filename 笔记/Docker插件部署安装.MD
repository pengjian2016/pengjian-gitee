## idea 集成docker
1. vim /lib/systemd/system/docker.service
   将
   ExecStart=/usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock
   注释替换为
   ExecStart=/usr/bin/dockerd -H tcp://0.0.0.0:2375 -H unix:///var/run/docker.sock
2. sudo systemctl daemon-reload
   sudo systemctl restart docker

3. netstat -nlpt
4. sudo firewall-cmd --add-port=2375/tcp --permanent
   sudo firewall-cmd --reload
   sudo firewall-cmd --zone=public --list-ports
5. curl http://127.0.0.1:2375/version




## portainer
1. 下载
>  docker pull portainer
> 下载汉化包 https://pan.baidu.com/s/1DV3rA4E0EFLdiPZ4oaUATg 密码 r4s9
2. 启动

   docker run -d -p 9000:9000 -p 8000:8000 --restart=always  -v /var/run/docker.sock:/var/run/docker.sock -v /home/pengjian/data/portainer_data:/data -v /home/pengjian/public:/public --name prtainer  portainer/portainer

   docker run -d --name portainer -p 9000:9000 -v /var/run/docker.sock:/var/run/docker.sock portainer/portainer
                                                       
```
  -d 后台运行
  -p 本机：docker机
 -restart 标志会检查容器的退出代码，并据此来决定是否要重启容器，默认是不会重启。
    -v /var/run/docker.sock:/var/run/docker.sock ：把宿主机的Docker守护进程(Docker daemon)默认监听的Unix域套接字挂载到容器中
    -v /home/pengjian/data/portainer_data:/data 把宿主机portainer_data数据卷挂载到容器/data目录-v /public:/public：把宿主机汉化包挂载到容器内
    -v /home/pengjian/public:/public 指向汉化
     –name prtainer ： 给容器起名为portainer
```

3. 重置密码
停止并删除portainer容器
docker ps -a 
docker rm xxx
docker inspect xxx 找到挂载目录
重置密码
docker run --rm -v /home/pengjian/data/portainer_data:/data portainer/helper-reset-password

_)FT9o8I#VW6lhEYy4*3,1!w&s0c:tb2


a}6p*>4lZ?2O8tg@Tn!0Gme`53Cf#IQ7
## docker 安装jdk





## docker 安装mysql
1. 下载
docker pull mysql:5.7
2. 安装
docker run -p 3306:3306 --name mysql -v /home/pengjian/data/mysql/conf:/etc/mysql/conf.d -v /home/pengjian/data/mysql/logs:/logs -v /home/pengjian/data/mysql/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=mysql -d mysql:5.7
开放端口 
systemctl status firewalld查看防火墙状态
systemctl start firewall 防火墙开启
systemctl stop firewall 防火墙关闭
netstat -anp 查询已开放的端口
firewall-cmd --query-port=3306/tcp 查询指定端口是否已开
firewall-cmd --add-port=3306/tcp --permanent
4. 查看并授权 
docker ps 

docker exec -it 6d8732c72758 /bin/bash

mysql -u root -p


GRANT ALL ON *.* TO 'root'@'%';

ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '123456';

flush privileges


