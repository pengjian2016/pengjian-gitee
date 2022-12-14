###k8s集群架构组件
*** 
1. master
   + apiserver  ` 集群同一入口，以restful方式，交给etcd存储`
   + scheduler ` 节点调度 选择node节点运用部署`
   + controller-manager `处理集群常规后台任务，一个资源对应一个控制器`
   + etcd ` 存储系统，保存集群相关数据`
2. node
   + kubelet ` master排到node的代表 管理本机容器` 
   + kube-proxy ` 提供网络代理，负载均衡等`
   
****
###核心
1. pod 
   - 最小部署单元
   - 一组容器的集合
   - 共享网络 namespace 
   - 生命周期短暂
2. controller
   - 确保预期pod的副本数量 
   - 确保所有node运行同一个pod
   - 一次性任务和定时任务
3. service
   - 定义一组pod的访问规则

### kebuctl 常用
- kubectl create deployment nginx --image=nginx
- kubectl expose deployment nginx --port=80 --type=NodePort
- kubectl get pod,svc
- kubectl apply -f 

### yaml文件
- `1 使用 create 命令生成yaml`
kubectl create deployment nginx --image=nginx -o yaml --dry-run > /etc/home/my.yaml
- `2 get导出yaml`
kubectl get deployment nginx -o=yaml --export > /etc/home/my.yaml
- pod 共享网络 通过 namespace 


### pod 明细
- 最小部署单元 
- 一组容器的集合 两个运用之间的交互 
- 共享网络命名空间  共享存储
- pod短暂生命
+ 拉取策略
> IFNotPresent 默认 不存在是拉取  
> always 每次创建pod 重新拉取  
> never 不会主动拉取  
+ 资源限制  
```yaml
resource:
   requests:
      memory:'64Mi' #调度
      cpu:'250m'
   limits:
      memory:'128Mi'  #最大
      cpu:'500m'
```
+重启机制
> always 默认 终止退出后，总是重启
> onFailure 异常退出才重启
> never 不重启
+ 健康检查
> livenessprobe 存活检查
> redinessprode 就绪检查
   - 三种检查方法
     1. httpget
     2. exec
     3. tcpsocket
### controller 明细
+ 确保预期的pod副本数量 所有node在同一个pod
+ 无状态应用部署 无先后顺序
+ 有状态应用部署 如mysql的主从
+ 部署 滚动升级
`
pod 和controller 通过 selector 和 ladel 标签关联
`
deployment运用
1.部署无状态运用
2.管理pod和replicaset
3.部署，滚动升级

### service 明细
+ 服务发现
+ 定义一组pod策略（负载均衡）
