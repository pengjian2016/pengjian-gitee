package com.example.sentineldemo.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphO;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjian
 * @since 2022-06-22
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello() {
        try (Entry entry = SphU.entry("hello")) {
            return "hello sentinel";
        } catch (BlockException e) {
            e.printStackTrace();
            return "系统繁忙！";
        }
    }

//    @PostConstruct
    public void initFlowRules() {
        List<FlowRule> ruleList = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("hello");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(1);
        ruleList.add(rule);
        FlowRuleManager.loadRules(ruleList);

    }


}
