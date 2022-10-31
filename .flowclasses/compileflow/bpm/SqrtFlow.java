package compileflow.bpm;

import com.alibaba.compileflow.engine.runtime.instance.ProcessInstance;
import java.util.HashMap;
import com.alibaba.compileflow.engine.common.utils.ObjectFactory;
import com.alibaba.compileflow.engine.common.utils.DataType;
import java.lang.Double;
import com.example.compileflowDemo.mock.MockJavaClazz;
import java.util.Map;
import com.alibaba.compileflow.engine.process.preruntime.generator.bean.BeanProvider;

public class SqrtFlow implements ProcessInstance {

    private java.lang.Double num = null;
    private java.lang.Double numSqrt = null;

    public Map<String, Object> execute(Map<String, Object> _pContext) throws Exception {
        num = (Double)DataType.transfer(_pContext.get("num"), Double.class);
        Map<String, Object> _pResult = new HashMap<>();
        //AutoTaskNode: 计算平方根
        numSqrt = ((MockJavaClazz)ObjectFactory.getInstance("com.example.compileflowDemo.mock.MockJavaClazz")).sqrt(num);
        _pResult.put("numSqrt", numSqrt);
        return _pResult;
    }

}