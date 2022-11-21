##Stream
+ 静态方法    
of iterate generate 
+ 中间操作    
filter 过滤   
limit(n) 获取n个元素 
skip(n) 跳过n元素 配合limit(n)分页  
distinct 去重 hashCode()和equals   
+ 映射  
map 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。  
flatMap接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。  
+ 排序    
sorted 自然排序，流中元素需实现Comparable接口  
sorted(Comparator com)  定制排序，自定义Comparator排序器
+ 消费  
peek 接收的是Consumer表达式，没有返回值。
+ 终止操作
