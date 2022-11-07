注释
<#-- -->
插入
${value}
ftl 指令 与html 类似 前面加#

<#assign  value="freemarker">
${value}

<#list goodsList as list>
    <tr>
        <td>${list_index +1}</td>
        <td>${list.name}</td>
        <td>${list.age}</td>
    </tr>
</#list>

<td <#if stu.name=='小明'>我是</#if> ${stu.name}>
</td>

<#if stu??></#if>
如果该变量存在,返回true,否则返回false
