# 数据库文档

**数据库名：** trade

**文档版本：** 0.0.1-SNAPSHOT

**文档描述：** 看房网-trade-数据库文档生成
| 表名                  | 说明       |
| :-------------------- | :--------- |
| [t_advance](#t_advance) | 垫佣单 |
| [t_advance_back_record](#t_advance_back_record) | 垫佣回款记录 |
| [t_advance_bill](#t_advance_bill) | 垫佣单成交单 |
| [t_advance_bill_assign](#t_advance_bill_assign) | 垫佣三级分配明细 |
| [t_advance_city_credit](#t_advance_city_credit) | 垫佣-总额度 |
| [t_advance_city_credit_item](#t_advance_city_credit_item) | 垫佣-总额度明细 |
| [t_advance_garden_credit](#t_advance_garden_credit) | 垫佣-楼盘额度 |
| [t_advance_garden_credit_item](#t_advance_garden_credit_item) | 垫佣-楼盘额度明细 |
| [t_advance_substitute](#t_advance_substitute) | 垫佣扣回 |
| [t_base_brand](#t_base_brand) | 品牌 |
| [t_base_business_entity](#t_base_business_entity) | 经营主体 |
| [t_base_city](#t_base_city) | 城市 |
| [t_base_company](#t_base_company) | 加盟公司 |
| [t_base_country](#t_base_country) | 国家 |
| [t_base_holiday](#t_base_holiday) | 日期 |
| [t_base_org](#t_base_org) | 组织信息 |
| [t_base_orgposition](#t_base_orgposition) | 岗位信息 |
| [t_base_person](#t_base_person) | 人员信息 |
| [t_base_positionhistory](#t_base_positionhistory) | 人员异动记录 |
| [t_base_province](#t_base_province) | 省份 |
| [t_base_sequence](#t_base_sequence) | 自增序列 |
| [t_base_store](#t_base_store) | 门店（铺位） |
| [t_basic_accessory](#t_basic_accessory) | 公司合同附件 |
| [t_basic_bank_account_configure](#t_basic_bank_account_configure) | 资金账号配置 |
| [t_basic_businesslog](#t_basic_businesslog) | 业务日志 |
| [t_basic_mq_message](#t_basic_mq_message) | MQ消息记录 |
| [t_bi_commission_rank](#t_bi_commission_rank) | 排名 |
| [t_commission_batch](#t_commission_batch) | 提成批次 |
| [t_commission_calculate_result](#t_commission_calculate_result) | 计算结果 |
| [t_commission_detail](#t_commission_detail) | 提成明细 |
| [t_commission_level_rule](#t_commission_level_rule) | 提成规则-通提 |
| [t_commission_operation_recharge](#t_commission_operation_recharge) | 运营资金导入 |
| [t_commission_payment](#t_commission_payment) | 提成发放明细 |
| [t_commission_payment_batch](#t_commission_payment_batch) | 提成发放批次 |
| [t_commission_payment_transfer](#t_commission_payment_transfer) | 提成发放转账 |
| [t_commission_plan](#t_commission_plan) | 提成方案 |
| [t_commission_segment_rule](#t_commission_segment_rule) | 提成规则-分段提 |
| [t_commission_transfer_batch](#t_commission_transfer_batch) | 提成发放批次 |
| [t_config_service_charge_standard](#t_config_service_charge_standard) | 交易服务费配置 |
| [t_contract_template](#t_contract_template) | 模板文本 |
| [t_finance_allotting_batch](#t_finance_allotting_batch) | 分账批次 |
| [t_finance_allotting_bill](#t_finance_allotting_bill) | 分账单 |
| [t_finance_allotting_detail](#t_finance_allotting_detail) | 分账明细 |
| [t_finance_allotting_transfer](#t_finance_allotting_transfer) | 分账平台-转账 |
| [t_finance_commission_advance_data](#t_finance_commission_advance_data) | 垫佣结佣资料 |
| [t_finance_commission_payoff](#t_finance_commission_payoff) | 发放记录 |
| [t_finance_deduction](#t_finance_deduction) | 业绩扣除 |
| [t_finance_electronic_account](#t_finance_electronic_account) | 电子账户 |
| [t_finance_ewallet_record](#t_finance_ewallet_record) | 电子钱包 |
| [t_finance_ganged_settlement](#t_finance_ganged_settlement) | 联动结佣 |
| [t_finance_ganged_settle_item](#t_finance_ganged_settle_item) | 联动结佣成交单 |
| [t_finance_gnete_transfer](#t_finance_gnete_transfer) | 好易联转账记录 |
| [t_finance_new_settlement](#t_finance_new_settlement) | 新房结算 |
| [t_finance_new_settle_detail](#t_finance_new_settle_detail) | 结算详情 |
| [t_finance_new_settle_fund](#t_finance_new_settle_fund) | 结算款项 |
| [t_finance_platform_return](#t_finance_platform_return) | 平台费返还配置 |
| [t_finance_settlement](#t_finance_settlement) | 结算单 |
| [t_finance_settlement_assign](#t_finance_settlement_assign) | 结算分配明细 |
| [t_finance_settlement_data](#t_finance_settlement_data) | 结佣资料 |
| [t_finance_settlement_pause](#t_finance_settlement_pause) | 暂停结算 |
| [t_finance_settlement_rule](#t_finance_settlement_rule) | 结算规则 |
| [t_finance_settlement_rule_data](#t_finance_settlement_rule_data) | 结算规则内容 |
| [t_gnete_transfer](#t_gnete_transfer) | 好易联转账 |
| [t_incomepay](#t_incomepay) | 收付款主表 |
| [t_incomepay_account](#t_incomepay_account) | 收付款账户 |
| [t_incomepay_advance_refund](#t_incomepay_advance_refund) | 垫佣退回 |
| [t_incomepay_bank_statement](#t_incomepay_bank_statement) | 银商对账单 |
| [t_incomepay_bank_statement_flag](#t_incomepay_bank_statement_flag) | 银商对账单结果 |
| [t_incomepay_cashier_income](#t_incomepay_cashier_income) | 新房出纳平台-收款 |
| [t_incomepay_cashier_pay](#t_incomepay_cashier_pay) | 新房出纳平台-付款 |
| [t_incomepay_distribution_fund](#t_incomepay_distribution_fund) | 分销款 |
| [t_incomepay_distribution_fund_detail](#t_incomepay_distribution_fund_detail) | 分销收款内容 |
| [t_incomepay_gnete_transaction](#t_incomepay_gnete_transaction) | 好易联交易明细 |
| [t_incomepay_info](#t_incomepay_info) | 收付款数据表 |
| [t_incomepay_other_account](#t_incomepay_other_account) | 收付款对方账户 |
| [t_incomepay_payment_big_type_configure](#t_incomepay_payment_big_type_configure) | 款项配置大类 |
| [t_incomepay_payment_configure](#t_incomepay_payment_configure) | 款项配置子类 |
| [t_incomepay_recincomepay](#t_incomepay_recincomepay) | 认筹收付款 |
| [t_note_electronicreceiptconfig](#t_note_electronicreceiptconfig) | 电子收据 |
| [t_note_electronic_receipt](#t_note_electronic_receipt) | 电子收据 |
| [t_note_invalidtoinvoice](#t_note_invalidtoinvoice) | 作废换发票子项 |
| [t_note_invoice_adjust](#t_note_invoice_adjust) | 新房发票调整 |
| [t_note_invoice_adjust_detail](#t_note_invoice_adjust_detail) | 新房发票调整明细 |
| [t_note_invoice_content](#t_note_invoice_content) | 开票内容配置 |
| [t_note_invoice_issue](#t_note_invoice_issue) | 开票信息 |
| [t_note_invoice_newh](#t_note_invoice_newh) | 新房发票 |
| [t_note_issue_funds](#t_note_issue_funds) | 开票款项信息 |
| [t_note_issue_subscribe](#t_note_issue_subscribe) | 开票成交信息 |
| [t_note_note](#t_note_note) | 票据 |
| [t_note_note_funds](#t_note_note_funds) | 开票款项明细 |
| [t_note_note_record](#t_note_note_record) | 票据操作记录 |
| [t_note_return_invoice](#t_note_return_invoice) | 退票申请 |
| [t_note_title](#t_note_title) | 发票抬头 |
| [t_sign_address_confirmation](#t_sign_address_confirmation) | 地址确认书 |
| [t_sign_cancel_agreement](#t_sign_cancel_agreement) | 撤单协议-电子 |
| [t_sign_commission_agreement](#t_sign_commission_agreement) | 佣金协议 |
| [t_sign_contract](#t_sign_contract) | 合同 |
| [t_sign_customer](#t_sign_customer) | 合同签署客户 |
| [t_sign_draft](#t_sign_draft) | 电子签-草稿 |
| [t_sign_furniture](#t_sign_furniture) | 家私清单 |
| [t_sign_furniture_items](#t_sign_furniture_items) | 家私清单子项 |
| [t_sign_lease_clause](#t_sign_lease_clause) | 电子签-租约信息 |
| [t_sign_margin_custodian](#t_sign_margin_custodian) | 定金托管协议 |
| [t_sign_operation_record](#t_sign_operation_record) | 操作记录 |
| [t_sign_org_config](#t_sign_org_config) | 签约组织配置 |
| [t_sign_owner](#t_sign_owner) | 合同签署业主 |
| [t_sign_paper_cancel_agreement](#t_sign_paper_cancel_agreement) | 纸质撤单协议 |
| [t_sign_party](#t_sign_party) | 合同签署方 |
| [t_sign_reservation](#t_sign_reservation) | 签约预约 |
| [t_sign_reservation_customer](#t_sign_reservation_customer) | 预约客户 |
| [t_sign_reservation_owner](#t_sign_reservation_owner) | 预约业主 |
| [t_sign_sale_clause](#t_sign_sale_clause) | 买卖合同信息 |
| [t_sign_site_config](#t_sign_site_config) | 签约点配置 |
| [t_sign_site_period_config](#t_sign_site_period_config) | 时间段 |
| [t_sign_template](#t_sign_template) | 合同模板 |
| [t_sign_transaction](#t_sign_transaction) | 合同签署批次 |
| [t_sign_user](#t_sign_user) | 签约用户 |
| [t_trade_allocation](#t_trade_allocation) | 新房分佣 |
| [t_trade_assign_related](#t_trade_assign_related) | 成交分配相关人员 |
| [t_trade_attachment](#t_trade_attachment) | 通用附件存储 |
| [t_trade_auditrecord](#t_trade_auditrecord) | 审核记录 |
| [t_trade_commission_adjust](#t_trade_commission_adjust) | 佣金调整 |
| [t_trade_commission_assign](#t_trade_commission_assign) | 业绩分配 |
| [t_trade_commission_scheme](#t_trade_commission_scheme) | 上数佣金标准方案 |
| [t_trade_commission_scheme_radio](#t_trade_commission_scheme_radio) | 上数佣金标准方案 |
| [t_trade_contract_configure](#t_trade_contract_configure) | 合同资料配置 |
| [t_trade_contract_configure_copy](#t_trade_contract_configure_copy) | 合同资料配置 |
| [t_trade_contract_data](#t_trade_contract_data) | 合同资料 |
| [t_trade_customer](#t_trade_customer) | 客户 |
| [t_trade_expand](#t_trade_expand) | 新房项目 |
| [t_trade_expandcontract](#t_trade_expandcontract) | 拓展合同 |
| [t_trade_garden](#t_trade_garden) | 楼盘 |
| [t_trade_house](#t_trade_house) | 房间 |
| [t_trade_node_settle_config](#t_trade_node_settle_config) | 节点结算配置 |
| [t_trade_owner](#t_trade_owner) | 业主 |
| [t_trade_performance_adjust](#t_trade_performance_adjust) | 业绩调整 |
| [t_trade_performance_complain](#t_trade_performance_complain) | 业绩申诉 |
| [t_trade_person_of_day](#t_trade_person_of_day) | 当日人员信息 |
| [t_trade_projectperson](#t_trade_projectperson) | 项目相关人员 |
| [t_trade_projectperson_history](#t_trade_projectperson_history) | 项目人员分配记录 |
| [t_trade_property_config](#t_trade_property_config) | 业务佣金标准配置 |
| [t_trade_property_config_interval](#t_trade_property_config_interval) | 业务佣金标准配置-成交总价区间 |
| [t_trade_property_config_ratio](#t_trade_property_config_ratio) | 业务佣金标准配置-成交总价区间 |
| [t_trade_recognizechips](#t_trade_recognizechips) | 新房认筹 |
| [t_trade_report_data](#t_trade_report_data) | 交易报告相关数据 |
| [t_trade_required_config](#t_trade_required_config) | 必要件配置 |
| [t_trade_required_scheme](#t_trade_required_scheme) | 必要件方案 |
| [t_trade_reservation](#t_trade_reservation) | 报备 |
| [t_trade_scheme_data_middle](#t_trade_scheme_data_middle) | 必要件方案-合同资料中间表 |
| [t_trade_subscribe](#t_trade_subscribe) | 新房成交 |
| [t_trade_subscribeassign](#t_trade_subscribeassign) | 新房分配 |
| [t_trade_subscribecancel](#t_trade_subscribecancel) | 新房撤单 |
| [t_trade_subscribecontract](#t_trade_subscribecontract) | 新房合同资料 |
| [t_trade_subscribecontract_update](#t_trade_subscribecontract_update) | 新房合同资料更新 |
| [t_trade_subscribe_commission_adjust](#t_trade_subscribe_commission_adjust) | 新房成交报告佣金调整 |
| [t_trade_subscribe_contract_adjust](#t_trade_subscribe_contract_adjust) | 新房成交报告合同调整 |
| [t_trade_subscribe_node](#t_trade_subscribe_node) | 节点跟进 |
| [t_trade_transaction_apply](#t_trade_transaction_apply) | 申请表 |
| [t_trade_transaction_apply_commission](#t_trade_transaction_apply_commission) | 申请数据表-申请佣金调整 |
| [t_trade_transaction_contract](#t_trade_transaction_contract) | 合同资料 |
| [t_trade_transaction_node](#t_trade_transaction_node) | 交易节点 |
| [t_trade_transaction_node_scheme](#t_trade_transaction_node_scheme) | 交易节点方案 |
| [t_trade_transaction_report](#t_trade_transaction_report) | 交易报告 |
| [t_trade_transaction_scheme_node](#t_trade_transaction_scheme_node) | 交易节点方案明细 |
| [t_transfer](#t_transfer) | 过户单 |
| [t_transfer_change](#t_transfer_change) | 过户变更 |
| [t_transfer_handover](#t_transfer_handover) | 过户物业交割 |
| [t_transfer_scheme](#t_transfer_scheme) | 过户方案 |
| [t_transfer_scheme_step](#t_transfer_scheme_step) | 过户方案步骤 |
| [t_transfer_scheme_step_required](#t_transfer_scheme_step_required) | 过户方案前置节点 |
| [t_transfer_step](#t_transfer_step) | 过户节点 |
| [t_transfer_step_datum](#t_transfer_step_datum) | 过户资料 |
| [t_transfer_step_instance](#t_transfer_step_instance) | 过户步骤 |
**表名：** <a id="t_advance">t_advance</a>

**说明：** 垫佣单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  3   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘Id  |
|  4   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名称  |
|  5   | FBIZ_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型  |
|  6   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展Id  |
|  7   | FDISTRIBUTOR_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分销类型：外联、加盟  |
|  8   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  9   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发金额  |
|  10   | FAUDIT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 审核状态  |
|  11   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  12   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  13   | FAPPLY_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  14   | FPAYOFF_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 发放状态  |
|  15   | FCASHIER_PLAT |   bit   | 1 |   0    |    Y     |  N   |       | 是否提交到出纳平台  |
|  16   | FCASHIER_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 出纳确认时间  |
|  17   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  18   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  19   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方经营主体ID  |
|  20   | FDISTRIBUTOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方名称（公司名、账户名）  |
|  21   | FDISTRIBUTOR_BANK |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方开户行  |
|  22   | FDISTRIBUTOR_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方账号  |
|  23   | FCONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认时间  |
|  24   | FCONFIRM_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 确认状态  |
|  25   | FREASON_FAILURE |   varchar   | 50 |   0    |    Y     |  N   |       | 确认失败原因  |
|  26   | FKPAYMENT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人  |
|  27   | FPAYMENT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人  |
|  28   | FKPAYMENT_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人组织  |
|  29   | FPAYMENT_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人组织  |
|  30   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核  |
|  31   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核  |
|  32   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  33   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  34   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  35   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  36   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  37   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  38   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  39   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  40   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  41   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  42   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  43   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_back_record">t_advance_back_record</a>

**说明：** 垫佣回款记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 扣回类型  |
|  3   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 来源Id：结算单ID、退回收款单ID  |
|  4   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据ID  |
|  5   | FBILL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 单据编号  |
|  6   | FKADVANCE_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣成交单Id  |
|  7   | FKGANGED_SETTLEMENT_ITEM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 联动结佣成交单ID  |
|  8   | FGANGED_SETTLEMENT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 联动结佣编号  |
|  9   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方经营主体ID  |
|  10   | FDISTRIBUTION_COMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方公司  |
|  11   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易ID  |
|  12   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  13   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 二手房交易报告  |
|  14   | FTRANSACTION_REPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 二手房交易报告  |
|  15   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  16   | FREPAY_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 扣回日期  |
|  17   | FREPAY_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 应扣回金额  |
|  18   | FSERVICE_FEE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费  |
|  19   | FACTUAL_REPAY_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实扣回金额  |
|  20   | FFINISHED |   varchar   | 50 |   0    |    Y     |  N   |       | 是否已生效  |
|  21   | FSUBSTITUTE_IDS |   varchar   | 300 |   0    |    Y     |  N   |       | 垫佣扣回IDS  |
|  22   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  23   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  24   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  25   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  26   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  27   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  28   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  29   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  30   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  31   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  32   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  33   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_bill">t_advance_bill</a>

**说明：** 垫佣单成交单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKADVANCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣Id  |
|  3   | FKGARDEN_CREDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘垫佣配置Id  |
|  4   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单Id  |
|  5   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 成交编号  |
|  6   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 二手房交易报告  |
|  7   | FTRANSACTION_REPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 二手房交易报告  |
|  8   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  9   | FBIZ_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型  |
|  10   | FSUBSCRIBE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 认购日期  |
|  11   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  12   | FTAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 税率  |
|  13   | FTAX_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额  |
|  14   | FTAX_AMOUNT_COMPLEMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额补足  |
|  15   | FSERVICE_FEE_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费率  |
|  16   | FSERVICE_FEE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费  |
|  17   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发金额  |
|  18   | FREPAY_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 已回款金额  |
|  19   | FREPAY_SERVICE_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费回款  |
|  20   | FIN_REPAY_SERVICE_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 扣款中服务费  |
|  21   | FIN_REPAY_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 回款中金额  |
|  22   | FSUBSTITUTE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣扣回情况  |
|  23   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  24   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  25   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  26   | FORG_Name |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方城市公司（加盟公司、外联公司）  |
|  27   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  28   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  29   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  30   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  31   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_bill_assign">t_advance_bill_assign</a>

**说明：** 垫佣三级分配明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKADVANCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣  |
|  3   | FKADVANCE_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣成交单  |
|  4   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 二手房交易报告  |
|  5   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  6   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  7   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  8   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  9   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  10   | FKAREA_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 片区  |
|  11   | FAREA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 片区  |
|  12   | FKBIG_REGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 大区  |
|  13   | FBIG_REGION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 大区  |
|  14   | FKSTORE_MANAGER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 店长  |
|  15   | FSTORE_MANAGER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 店长  |
|  16   | FRATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例  |
|  17   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  18   | FTAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 税率  |
|  19   | FTAX_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额  |
|  20   | FTAX_AMOUNT_COMPLEMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额补足  |
|  21   | FSERVICE_FEE_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费率  |
|  22   | FSERVICE_FEE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费  |
|  23   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发金额  |
|  24   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  25   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  26   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  27   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  28   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  29   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  30   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  31   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  32   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  33   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  34   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  35   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_city_credit">t_advance_city_credit</a>

**说明：** 垫佣-总额度

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态（待启用、启用、禁用）  |
|  3   | FDISABLED_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 禁用时间  |
|  4   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  5   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  6   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  7   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  8   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  9   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  10   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  11   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  12   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  13   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  14   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  15   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_city_credit_item">t_advance_city_credit_item</a>

**说明：** 垫佣-总额度明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKCITY_CREDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 总额度表  |
|  3   | FCREDIT |   decimal   | 20 |   2    |    Y     |  N   |       | 额度  |
|  4   | KCREDIT_SUBTRACT |   decimal   | 20 |   2    |    Y     |  N   |       | 与前一个的额度差  |
|  5   | FTHRESHOLD_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 额度警戒类型(按比例-RATIO/按金额-AMOUNT)  |
|  6   | FTHRESHOLD_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 警戒类型中的内容  |
|  7   | FTHRESHOLD_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 警戒值  |
|  8   | FAPPLY_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  9   | FAUDIT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 总额度明细-审核状态  |
|  10   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  11   | FPREVIOUS |   varchar   | 50 |   0    |    Y     |  N   |       | 上一个ID  |
|  12   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  13   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  14   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  15   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  16   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  17   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  18   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  19   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  20   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  21   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  22   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  23   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_garden_credit">t_advance_garden_credit</a>

**说明：** 垫佣-楼盘额度

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘  |
|  3   | FGARDEN_NAME |   varchar   | 150 |   0    |    Y     |  N   |       | 楼盘  |
|  4   | FKCURRENT_ITEM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 当前明细ID  |
|  5   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 开始时间  |
|  6   | FEND_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 结束时间  |
|  7   | FOUTREACH_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 外联费率  |
|  8   | FALLIANCE_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 合作费率  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  16   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  18   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  19   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_garden_credit_item">t_advance_garden_credit_item</a>

**说明：** 垫佣-楼盘额度明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKGARDEN_CREDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘额度  |
|  3   | FCREDIT |   decimal   | 20 |   2    |    Y     |  N   |       | 预计垫佣额度=额度  |
|  4   | FKNODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣节点ID  |
|  5   | FNODE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣节点  |
|  6   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  7   | FAPPLY_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  8   | FAUDIT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  9   | FCREDIT_SUBTRACT |   decimal   | 20 |   2    |    Y     |  N   |       | 与前一个的额度差  |
|  10   | FPREVIOUS |   varchar   | 50 |   0    |    Y     |  N   |       | 上一个明细ID  |
|  11   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  13   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  14   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  15   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  16   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  18   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  20   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  21   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_advance_substitute">t_advance_substitute</a>

**说明：** 垫佣扣回

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKADVANCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣单Id  |
|  3   | FKADVANCE_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣成交单Id  |
|  4   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单Id  |
|  5   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单Id  |
|  6   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  7   | FADVANCE_BACK_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 已扣回金额  |
|  8   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  9   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  10   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_base_brand">t_base_brand</a>

**说明：** 品牌

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 100 |   0    |    Y     |  N   |       | 品牌名称  |
|  3   | FBRAND_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌类型  |
|  4   | FCONTACT |   varchar   | 100 |   0    |    Y     |  N   |       | 品牌联系人  |
|  5   | FCONTACT_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 联系人电话  |
|  6   | FLEGAL_PERSON |   varchar   | 100 |   0    |    Y     |  N   |       | 法人姓名  |
|  7   | FKLEGAL_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 法人身份证号  |
|  8   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名称  |
|  9   | FKLICENSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 营业执照ID  |
|  10   | FADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 公司地址  |
|  11   | FSCOPE |   varchar   | 500 |   0    |    Y     |  N   |       | 经营范围  |
|  12   | FREMARK |   varchar   | 500 |   0    |    Y     |  N   |       | 备注  |
|  13   | FKCREATE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人ID  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | FKMODIFY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 修改人ID  |
|  16   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 修改时间  |
|  17   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织ID  |
|  18   | FID_CARD_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 正面身份证  |
|  19   | FBACK_ID_CARD_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 反面身份证  |
|  20   | FLICENSE_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 营业执照URL  |
|  21   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 修改人名称  |
|  22   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  25   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_business_entity">t_base_business_entity</a>

**说明：** 经营主体

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名称  |
|  3   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 公司类型  |
|  4   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | OA公司ID  |
|  5   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市(地址)  |
|  6   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市名称  |
|  7   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | orgid  |
|  8   | FSEAL_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 公司公章URL  |
|  9   | FFINANCIAL_SEAL_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 财务印章URL  |
|  10   | FDETAIL_ADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 详细地址  |
|  11   | FBANK_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 开户行名称  |
|  12   | FCORPORATE_ACCOUNT |   varchar   | 100 |   0    |    Y     |  N   |       | 对公账户  |
|  13   | FID_CARD_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 法人身份证件-正  |
|  14   | FBACK_ID_CARD_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 法人身份证件-反  |
|  15   | FLICENSE_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 营业执照  |
|  16   | FKREGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 区域(地址)  |
|  17   | FREGION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 区域名  |
|  18   | FLEGAL_PERSON |   varchar   | 50 |   0    |    Y     |  N   |       | 法人姓名  |
|  19   | FLEGAL_PERSON_ID_CARD |   varchar   | 50 |   0    |    Y     |  N   |       | 法人身份证号  |
|  20   | FCONTACT_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 联系电话  |
|  21   | FSOURCE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 公司状态  |
**表名：** <a id="t_base_city">t_base_city</a>

**说明：** 城市

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市名称  |
|  3   | FKPROVINCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 所属省份id  |
|  4   | FSERIAL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  5   | FINDEX |   decimal   | 20 |   0    |    Y     |  N   |       | 排序  |
|  6   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  7   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  8   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
**表名：** <a id="t_base_company">t_base_company</a>

**说明：** 加盟公司

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名称  |
|  3   | FSHORT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 简称  |
|  4   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市(地址)  |
|  5   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市名称  |
|  6   | FKREGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 区域ID  |
|  7   | FREGION_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 区域名  |
|  8   | FDETAIL_ADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 详细地址  |
|  9   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟品牌ID  |
|  10   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟品牌名字  |
|  11   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织ID  |
|  12   | FKOWNER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 店东/实控人ID  |
|  13   | FOWNER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 店东/实控人  |
|  14   | FSEAL_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 公司印章  |
|  15   | FFINANCIAL_SEAL_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 财务章  |
|  16   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 使用状态  |
|  17   | FENABLE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 使用状态描述  |
|  18   | FBANK_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 开户行名称  |
|  19   | FCORPORATE_ACCOUNT |   varchar   | 100 |   0    |    Y     |  N   |       | 对公账户  |
|  20   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  23   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_country">t_base_country</a>

**说明：** 国家

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 国家名称  |
|  3   | FCODE |   varchar   | 20 |   0    |    Y     |  N   |       | code  |
|  4   | FINITIAL |   varchar   | 10 |   0    |    Y     |  N   |       | 首字母  |
|  5   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  6   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  7   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
**表名：** <a id="t_base_holiday">t_base_holiday</a>

**说明：** 日期

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FHOLIDAY |   tinyint   | 3 |   0    |    Y     |  N   |       | 假日  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  4   | FWAGE |   int   | 10 |   0    |    Y     |  N   |       | 薪资倍数  |
|  5   | FDATE |   date   | 10 |   0    |    Y     |  N   |       | 日期  |
|  6   | FWEEK |   int   | 10 |   0    |    Y     |  N   |       | 星期  |
|  7   | FAFTER |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否为补班  |
|  8   | FTARGET |   varchar   | 50 |   0    |    Y     |  N   |       | 补班名称  |
|  9   | FREST |   int   | 10 |   0    |    Y     |  N   |       | 休息  |
|  10   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  11   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  12   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  13   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_base_org">t_base_org</a>

**说明：** 组织信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  3   | FNAME |   varchar   | 100 |   0    |    Y     |  N   |       | 名称  |
|  4   | FORG_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 启用状态  |
|  5   | FLEVEL |   int   | 10 |   0    |    Y     |  N   |       | 层级，最顶层为1  |
|  6   | FKSTORE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 门店ID  |
|  7   | FSTORE_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 门店名  |
|  8   | FKPARENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 父节点  |
|  9   | FKCOMPANY_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司主体ID  |
|  10   | FCOMPANY_ENTITY_NAME |   varchar   | 60 |   0    |    Y     |  N   |       | 公司主体  |
|  11   | FLONG_NUMBER |   varchar   | 300 |   0    |    Y     |  N   |       |   |
|  12   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市驻地Code  |
|  13   | FCITY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 城市驻地Name  |
|  14   | FSTORE_LABEL |   varchar   | 30 |   0    |    Y     |  N   |       | 门店标签  |
|  15   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  18   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_orgposition">t_base_orgposition</a>

**说明：** 岗位信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位名称  |
|  3   | FKPOSITION_TYPE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位类型ID  |
|  4   | FIS_MANAGER |   varchar   | 50 |   0    |    Y     |  N   |       | 是否管理岗位  |
|  5   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  6   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_person">t_base_person</a>

**说明：** 人员信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FCODE |   varchar   | 50 |   0    |    Y     |  N   |       | 编码  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  4   | FPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 电话  |
|  5   | FCARD_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型  |
|  6   | FCARD_TYPE_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型描述  |
|  7   | FCARD_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号  |
|  8   | FSEX |   varchar   | 50 |   0    |    Y     |  N   |       | 性别  |
|  9   | FJOIN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 入职日期  |
|  10   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 人员状态  |
|  11   | FKMAJOR_POSITION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 主岗位  |
|  12   | FKDEFAULT_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 主岗位组织  |
|  13   | FACCOUNT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 账号状态  |
|  14   | FPHOTO_URL |   varchar   | 256 |   0    |    Y     |  N   |       | 头像  |
|  15   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌id  |
|  16   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  19   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_positionhistory">t_base_positionhistory</a>

**说明：** 人员异动记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  3   | FKORG_POSITION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位（暂无）  |
|  4   | FKPOSITION_TYPE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位类型ID  |
|  5   | FKLEVEL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 职级ID  |
|  6   | FLEVEL_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 职级名称  |
|  7   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  8   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 任职开始  |
|  9   | FEND_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 任职结束  |
|  10   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  11   | FSTATUS_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 状态：入职、转正、兼职、调动、离职  |
|  12   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
**表名：** <a id="t_base_province">t_base_province</a>

**说明：** 省份

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  3   | FSERIAL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FINDEX |   decimal   | 20 |   0    |    Y     |  N   |       | 序号  |
|  5   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  6   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  7   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
**表名：** <a id="t_base_sequence">t_base_sequence</a>

**说明：** 自增序列

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | SEQ_NAME |   varchar   | 50 |   0    |    N     |  Y   |       | 序列的名字  |
|  2   | CURRENT_VALUE |   bigint   | 19 |   0    |    N     |  N   |       | 序列的当前值  |
|  3   | INCREMENT |   int   | 10 |   0    |    N     |  N   |   1    | 序列的自增值  |
**表名：** <a id="t_base_store">t_base_store</a>

**说明：** 门店（铺位）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 门店名称  |
|  3   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  4   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌id  |
|  5   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌名称  |
|  6   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名  |
|  9   | FKREGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 区域id  |
|  10   | FREGION_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 区域名称  |
|  11   | FDETAIL_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 详细地址  |
|  12   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市编码  |
|  13   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市名称  |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_basic_accessory">t_basic_accessory</a>

**说明：** 公司合同附件

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 64 |   0    |    N     |  Y   |       |   |
|  2   | FENTITY_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 所属实体ID  |
|  3   | FURL |   varchar   | 200 |   0    |    Y     |  N   |       | 附件url地址  |
|  4   | FFILE_SIZE |   varchar   | 200 |   0    |    Y     |  N   |       | 附件大小  |
|  5   | FFILE_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 附件文件名  |
|  6   | FTYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 附件类型（合同附件，公司logo图片）  |
|  7   | FSUBTYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 附件子类型：(营业执照,一般纳税人资质,其他)  |
|  8   | FREMARK |   varchar   | 100 |   0    |    Y     |  N   |       | 备注  |
|  9   | FCREATE_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 创建人id  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  12   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  13   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_basic_bank_account_configure">t_basic_bank_account_configure</a>

**说明：** 资金账号配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FCITY |   varchar   | 150 |   0    |    Y     |  N   |       | 城市  |
|  4   | FACCOUNT_TYPE |   varchar   | 30 |   0    |    Y     |  N   |       | 账户类型  |
|  5   | FACCOUNT_NAME |   varchar   | 30 |   0    |    Y     |  N   |       | 账户名称  |
|  6   | FACCOUNT_NUMBER |   varchar   | 30 |   0    |    Y     |  N   |       | 账户号码  |
|  7   | FAGENT_NEW_TYPE |   varchar   | 30 |   0    |    Y     |  N   |   AGENT    | 新房/二手房类型  |
|  8   | FBANK_NAME |   varchar   | 30 |   0    |    Y     |  N   |       | 所属银行  |
|  9   | FOPEN_BANK_NAME |   varchar   | 30 |   0    |    Y     |  N   |       | 开户行  |
|  10   | FINCOMEPAYTYPE |   varchar   | 30 |   0    |    Y     |  N   |       | 收付类型  |
|  11   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体ID  |
|  12   | FBODY_COMPANY_ID |   varchar   | 30 |   0    |    Y     |  N   |       | 公司主体id  |
|  13   | FBODY_COMPANY_NAME |   varchar   | 30 |   0    |    Y     |  N   |       | 公司主体名  |
|  14   | FSTATUS |   varchar   | 30 |   0    |    Y     |  N   |       | 状态ENABLED(启用),DISABLED(禁用)  |
|  15   | FREMARK |   varchar   | 300 |   0    |    Y     |  N   |       | 备注  |
|  16   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  17   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  18   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  19   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  20   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_basic_businesslog">t_basic_businesslog</a>

**说明：** 业务日志

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 64 |   0    |    N     |  Y   |       |   |
|  2   | FENTITY_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 实体id  |
|  3   | FTYPE |   varchar   | 30 |   0    |    N     |  N   |       | 业务类型  |
|  4   | FSUB_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型子类  |
|  5   | FKEY |   varchar   | 200 |   0    |    Y     |  N   |       | ID/URL  |
|  6   | FCONTENT |   json   | 1073741824 |   0    |    N     |  N   |       | 操作内容  |
|  7   | FKLOGIN_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 登录人  |
|  8   | FCREATE_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 操作者id  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  11   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  12   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  13   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_basic_mq_message">t_basic_mq_message</a>

**说明：** MQ消息记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FMQ_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 消息名  |
|  3   | FCONTENT |   varchar   | 500 |   0    |    Y     |  N   |       | 内容  |
|  4   | FTIME |   timestamp   | 23 |   0    |    N     |  N   |   CURRENT_TIMESTAMP(3)    | 时间  |
|  5   | FPROCEED |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否处理  |
|  6   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_bi_commission_rank">t_bi_commission_rank</a>

**说明：** 排名

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FRANKING_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 排名范围  |
|  3   | FPERFORMANCE_RANKING |   mediumintunsigned   | 8 |   0    |    Y     |  N   |       | 业绩排名  |
|  4   | FPERFORMANCE_UP |   decimal   | 20 |   2    |    Y     |  N   |       | 距上一位  |
|  5   | FPERFORMANCE_DOWN |   decimal   | 20 |   2    |    Y     |  N   |       | 距下一位  |
|  6   | FORDER_RANKING |   mediumintunsigned   | 8 |   0    |    Y     |  N   |       | 单量排名  |
|  7   | FORDER_UP |   decimal   | 20 |   2    |    Y     |  N   |       | 距上一位  |
|  8   | FORDER_DOWN |   decimal   | 20 |   2    |    Y     |  N   |       | 距下一位  |
|  9   | FKBROKER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  10   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  11   | FPERFORMANCE |   decimal   | 20 |   2    |    Y     |  N   |       | 业绩  |
|  12   | FORDER_COUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 单量  |
|  13   | FSTART |   date   | 10 |   0    |    Y     |  N   |       | 开始日期  |
|  14   | FEND |   date   | 10 |   0    |    Y     |  N   |       | 结束日期  |
|  15   | FDIMENSIONALITY |   varchar   | 20 |   0    |    Y     |  N   |       | 排名维度  |
|  16   | FDATE |   date   | 10 |   0    |    Y     |  N   |       | 截止日期  |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  21   | FDATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 统计时间类型  |
**表名：** <a id="t_commission_batch">t_commission_batch</a>

**说明：** 提成批次

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 20 |   0    |    Y     |  N   |       | 编号  |
|  3   | FMONTH |   date   | 10 |   0    |    Y     |  N   |       | 提成月  |
|  4   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司  |
|  5   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  6   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  7   | FCOMMISSION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 提成金额  |
|  8   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  9   | FSUBMIT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 计算时间  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  11   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  12   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  13   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  14   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  15   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  16   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  17   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  18   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  19   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  20   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_calculate_result">t_commission_calculate_result</a>

**说明：** 计算结果

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FCALCULATE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 计算ID  |
|  3   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  4   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  5   | FKORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FKLEVEL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  8   | FLEVEL_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  9   | FKCOMMISSION_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员  |
|  10   | FCOMMISSION_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员  |
|  11   | FCOMMISSION_PERSON_CODE |   varchar   | 10 |   0    |    Y     |  N   |       | 提成人员工号  |
|  12   | FKCOMMISSION_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 提成人员组织  |
|  13   | FCOMMISSION_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员组织  |
|  14   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告ID  |
|  15   | FTRANSACTION_REPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  16   | FTRANSACTION_DATE |   date   | 10 |   0    |    Y     |  N   |       | 成交日期  |
|  17   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  18   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  19   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单ID  |
|  20   | FKSETTLEMENT_ASSIGN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算明细ID  |
|  21   | FASSIGN_KEY |   varchar   | 64 |   0    |    Y     |  N   |       | 分配KEY  |
|  22   | FSETTLEMENT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 结算编号  |
|  23   | FSETTLEMENT_DATE |   date   | 10 |   0    |    Y     |  N   |       | 结算编号  |
|  24   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  25   | FASSIGN_TYPE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型描述  |
|  26   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  27   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司ID  |
|  28   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名  |
|  29   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  30   | FMTD_SETTLED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 历史已计提  |
|  31   | FCOMMISSION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 提成金额  |
|  32   | FCOMMISSION_EXPRESSION |   varchar   | 250 |   0    |    Y     |  N   |       | 提成公式  |
|  33   | FCOMMISSION_RATIO |   decimal   | 10 |   0    |    Y     |  N   |       | 提成比例  |
|  34   | FKPLAN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案  |
|  35   | FPLAN_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 方案  |
|  36   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  37   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  38   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  39   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  40   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  41   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  42   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  43   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  44   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  45   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  46   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  47   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  48   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_detail">t_commission_detail</a>

**说明：** 提成明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKBATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 提成批次  |
|  3   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  4   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  5   | FKORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FKLEVEL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  8   | FLEVEL_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  9   | FKCOMMISSION_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员  |
|  10   | FCOMMISSION_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员  |
|  11   | FCOMMISSION_PERSON_CODE |   varchar   | 10 |   0    |    Y     |  N   |       | 提成人员工号  |
|  12   | FKCOMMISSION_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 提成人员组织  |
|  13   | FCOMMISSION_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 提成人员组织  |
|  14   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告ID  |
|  15   | FTRANSACTION_REPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  16   | FTRANSACTION_DATE |   date   | 10 |   0    |    Y     |  N   |       | 成交日期  |
|  17   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  18   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  19   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单ID  |
|  20   | FKSETTLEMENT_ASSIGN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算明细ID  |
|  21   | FASSIGN_KEY |   varchar   | 64 |   0    |    Y     |  N   |       | 分配KEY  |
|  22   | FSETTLEMENT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 结算编号  |
|  23   | FSETTLEMENT_DATE |   date   | 10 |   0    |    Y     |  N   |       | 结算日期  |
|  24   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  25   | FASSIGN_TYPE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型描述  |
|  26   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体ID  |
|  27   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体名称  |
|  28   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体名称  |
|  29   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  30   | FMTD_SETTLED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 历史已计提  |
|  31   | FCOMMISSION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 提成金额  |
|  32   | FCOMMISSION_EXPRESSION |   varchar   | 250 |   0    |    Y     |  N   |       | 提成公式  |
|  33   | FCOMMISSION_RATIO |   decimal   | 10 |   0    |    Y     |  N   |       | 提成比例  |
|  34   | FKPLAN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案  |
|  35   | FPLAN_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 方案  |
|  36   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  37   | FAPPLY_STATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 提成申请状态  |
|  38   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  39   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  40   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  41   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  42   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  43   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  44   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  45   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  46   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  47   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  48   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  49   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
|  50   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 乐观锁版本  |
**表名：** <a id="t_commission_level_rule">t_commission_level_rule</a>

**说明：** 提成规则-通提

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKCOMMISSION_PLAN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案  |
|  3   | FKPOSITION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位  |
|  4   | FPOSITION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位  |
|  5   | FKLEVEL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  6   | FLEVEL_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 职级  |
|  7   | FSTART_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例范围  |
|  8   | FEND_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例范围  |
|  9   | FRATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例  |
|  10   | FINDEX |   decimal   | 20 |   2    |    Y     |  N   |       | 排序  |
|  11   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  12   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  13   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_operation_recharge">t_commission_operation_recharge</a>

**说明：** 运营资金导入

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名称  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 充值流水号(交易订单号)  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易类型  |
|  5   | FPARAGRAPH_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 款项  |
|  6   | FINCOME_PAY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 收支类型  |
|  7   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  8   | FPAYMENT_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 付款账户名  |
|  9   | FPAYMENT_ACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 付款账号  |
|  10   | FINCOME_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 入账账户名  |
|  11   | FINCOME_ACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 入账账号  |
|  12   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 摘要  |
|  13   | FREASON |   varchar   | 50 |   0    |    Y     |  N   |       | 原因  |
|  14   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 匹配状态  |
|  15   | FMATCH_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 匹配时间  |
|  16   | FCONFIRM_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 确认状态  |
|  17   | FCONFIRM_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 确认时间  |
|  18   | FTRADE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 交易时间  |
|  19   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  20   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  21   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  22   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  23   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  24   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  25   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  26   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  27   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  28   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  29   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  30   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_payment">t_commission_payment</a>

**说明：** 提成发放明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKPAYMENT_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发放批次  |
|  3   | FKTRANSFER_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 划付批次  |
|  4   | FKTRANSFER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转账记录  |
|  5   | FKCOMMISSION_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 提成批次  |
|  6   | FKCOMMISSION_DETAIL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 提成明细，一对一  |
|  7   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  8   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  9   | FCOMMISSION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 提成金额  |
|  10   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 渠道手续费/交易手续费  |
|  11   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  12   | FASSIGN_TYPE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型描述  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  20   | FENABLE |   varchar   | 10 |   0    |    Y     |  N   |       | 是否有效  |
|  21   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本号  |
|  22   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  23   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  24   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  25   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_payment_batch">t_commission_payment_batch</a>

**说明：** 提成发放批次

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 发放批次编号  |
|  3   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司  |
|  4   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  5   | FCOMMISSION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 提成金额  |
|  6   | FAPPLY_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  7   | FAUDIT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 审核状态  |
|  8   | FPAYMENT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 发放状态  |
|  9   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核  |
|  10   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核  |
|  11   | FPAYMENT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 发放时间  |
|  12   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  20   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本号  |
|  21   | FENABLE |   varchar   | 10 |   0    |    Y     |  N   |       | 是否有效  |
|  22   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  23   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  24   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  25   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_payment_transfer">t_commission_payment_transfer</a>

**说明：** 提成发放转账

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKPAYMENT_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发放批次  |
|  3   | FAMOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 转账金额（单位为分、1元=100分）  |
|  4   | FDESC |   varchar   | 50 |   0    |    Y     |  N   |       | 描述（入账备注）  |
|  5   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  6   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司ID  |
|  7   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名  |
|  8   | FKELECTRONIC_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 账户  |
|  9   | FKFROM_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包ID  |
|  10   | FFROM_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包  |
|  11   | FKTO_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包ID  |
|  12   | FTO_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包  |
|  13   | FTRANSFER_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 转账状态  |
|  14   | FSUBMIT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 提交分账时间  |
|  15   | FSCHEDULE_DATE |   date   | 10 |   0    |    Y     |  N   |       | 预约划付日期  |
|  16   | FFAIL_REASON |   varchar   | 50 |   0    |    Y     |  N   |       | 失败原因  |
|  17   | FMCT_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户订单号  |
|  18   | FSN |   varchar   | 50 |   0    |    Y     |  N   |       | 明细流水号  |
|  19   | FEXT_IDX_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 外部索引号  |
|  20   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  21   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  22   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  23   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  24   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  25   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  26   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  27   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本号  |
|  28   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  30   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  31   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_plan">t_commission_plan</a>

**说明：** 提成方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  3   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 方案类型经纪人,管理层等  |
|  4   | FSCOPE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 提成范围：城市品牌合作公司  |
|  5   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  6   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  7   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  8   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  9   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合作公司  |
|  10   | FCOMPANY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 合作公司  |
|  11   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  12   | FBUSINESS_ENTITY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 经营主体  |
|  13   | FTRANSACTION_TYPES |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型租/售/代理等(多个用字符串拼接)TransactionTypeEnum  |
|  14   | FPLATFORM_DEDUCT_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 平台税费  |
|  15   | FOWNER_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 创始店东提成比例  |
|  16   | FINCUBATOR_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 孵化人提成比例  |
|  17   | FRULE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 规则类型通提,实收等  |
|  18   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态（待启用、启用、禁用）  |
|  19   | FSTART_DATE |   date   | 10 |   0    |    Y     |  N   |       | 启用日期  |
|  20   | FEND_DATE |   date   | 10 |   0    |    Y     |  N   |       | 禁用日期  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  22   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  23   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  25   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  28   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  30   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  31   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_segment_rule">t_commission_segment_rule</a>

**说明：** 提成规则-分段提

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKCOMMISSION_PLAN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案  |
|  3   | FINDEX |   decimal   | 20 |   2    |    Y     |  N   |       | 排序  |
|  4   | FINTERVAL_START |   decimal   | 20 |   2    |    Y     |  N   |       | 区间开始  |
|  5   | FINTERVAL_END |   decimal   | 20 |   2    |    Y     |  N   |       | 区间结束  |
|  6   | FRATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例  |
|  7   | FMINIMUM_GUARANTEE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否白果线  |
|  8   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  9   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  10   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_commission_transfer_batch">t_commission_transfer_batch</a>

**说明：** 提成发放批次

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  3   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  4   | FTRANSFER_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 时间  |
|  5   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  6   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  7   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  8   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  11   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  12   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本号  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  15   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  16   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_config_service_charge_standard">t_config_service_charge_standard</a>

**说明：** 交易服务费配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  3   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  4   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  5   | FKREGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 区县ID  |
|  6   | FREGION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 区县  |
|  7   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌ID  |
|  8   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  9   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合作公司ID  |
|  10   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 合作公司  |
|  11   | FONETIME_PAYMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 一次性  |
|  12   | FMORTGAGE |   decimal   | 20 |   2    |    Y     |  N   |       | 公积金贷款  |
|  13   | FACCUMULATION_FUND |   decimal   | 20 |   2    |    Y     |  N   |       | 商业贷款  |
|  14   | FCOMPOSITE_MORTGAGE |   decimal   | 20 |   2    |    Y     |  N   |       | 组合贷款  |
|  15   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  16   | FSTART_DATE |   date   | 10 |   0    |    Y     |  N   |       | 开始日期  |
|  17   | FEND_DATE |   date   | 10 |   0    |    Y     |  N   |       | 结束日期  |
|  18   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  19   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  20   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  21   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  22   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  23   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  24   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  25   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  26   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  27   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  28   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  29   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  30   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_contract_template">t_contract_template</a>

**说明：** 模板文本

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTEXT |   text   | 65535 |   0    |    Y     |  N   |       | 文本  |
|  3   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_allotting_batch">t_finance_allotting_batch</a>

**说明：** 分账批次

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 批次号  |
|  3   | FTOTAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分账金额  |
|  4   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 渠道手续费/交易手续费  |
|  5   | FPLAT_CHARGE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 合作经营费金额  |
|  6   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  7   | FPLAT_CHARGE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 合作经营费划付状态  |
|  8   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  16   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  18   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  19   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_allotting_bill">t_finance_allotting_bill</a>

**说明：** 分账单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单  |
|  4   | FKALLOTTING_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 批次  |
|  5   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  6   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 渠道手续费/交易手续费  |
|  7   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分账金额  |
|  8   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  10   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  11   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  12   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  13   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  14   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  15   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  17   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  18   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_allotting_detail">t_finance_allotting_detail</a>

**说明：** 分账明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  4   | FPROPERTY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  6   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单  |
|  7   | FSETTLEMENT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单编号  |
|  8   | FKALLOTTING_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分账单  |
|  9   | FKALLOTTING_TRANSFER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转账记录  |
|  10   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  11   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  12   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  13   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  14   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  15   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  16   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  17   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  18   | FDESC |   varchar   | 150 |   0    |    Y     |  N   |       | 款项描述  |
|  19   | FASSIGN_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分配金额  |
|  20   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 渠道手续费/交易手续费  |
|  21   | FRECEIVED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分账金额  |
|  22   | FKPAYER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方  |
|  23   | FKPAYER_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方公司ID  |
|  24   | FKPAYEE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方  |
|  25   | FKPAYEE_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方公司ID  |
|  26   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  27   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  28   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  29   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_allotting_transfer">t_finance_allotting_transfer</a>

**说明：** 分账平台-转账

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单  |
|  6   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 流水号  |
|  7   | FKALLOTTING_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分账单  |
|  8   | FKALLOTTING_BATCH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分账批次  |
|  9   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项  |
|  10   | FDESC |   varchar   | 300 |   0    |    Y     |  N   |       | 描述（入账备注）  |
|  11   | FASSIGN_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分配金额  |
|  12   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 渠道手续费/交易手续费  |
|  13   | FAMOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 转账金额  |
|  14   | FKPAYER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方  |
|  15   | FKPAYER_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方公司  |
|  16   | FKPAYER_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方账户  |
|  17   | FKFROM_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包ID  |
|  18   | FFROM_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包  |
|  19   | FTO_WALLET_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 入账账户类型  |
|  20   | FKPAYEE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方  |
|  21   | FKPAYEE_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方公司  |
|  22   | FKPAYEE_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方账户  |
|  23   | FKTO_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包ID  |
|  24   | FTO_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包  |
|  25   | FTRANSFER_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 转账类型：即时、定时  |
|  26   | FALLOTTING_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分账类型（成交方、合作方）  |
|  27   | FTRANSFER_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 转账状态  |
|  28   | FFAIL_REASON |   varchar   | 300 |   0    |    Y     |  N   |       | 失败原因  |
|  29   | FMCT_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户订单号  |
|  30   | FSN |   varchar   | 50 |   0    |    Y     |  N   |       | 明细流水号  |
|  31   | FEXT_IDX_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 外部索引号  |
|  32   | FSUBMIT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 提交分账时间  |
|  33   | FSCHEDULE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 预约划付日期  |
|  34   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  35   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  36   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  37   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  38   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  39   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  40   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  41   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  42   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  43   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  44   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本  |
|  45   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_commission_advance_data">t_finance_commission_advance_data</a>

**说明：** 垫佣结佣资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FDATA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 资料名称  |
|  3   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  4   | FDATA_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 资料类型  |
|  5   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  6   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  7   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  8   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  11   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  12   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  13   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  14   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  15   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  16   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_commission_payoff">t_finance_commission_payoff</a>

**说明：** 发放记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 发放编号  |
|  3   | FAMOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 发放金额  |
|  4   | FTIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 时间  |
|  5   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  6   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  7   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  8   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  11   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  12   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_deduction">t_finance_deduction</a>

**说明：** 业绩扣除

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  3   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  4   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  5   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  6   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  8   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  11   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  12   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_electronic_account">t_finance_electronic_account</a>

**说明：** 电子账户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  2   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  3   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  4   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司、城市公司主体  |
|  5   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司、城市公司主体  |
|  6   | FKCOMPANY_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司组织  |
|  7   | FCOMPANY_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司组织  |
|  8   | FKBUSINESS_ENTITY_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 经营主体  |
|  9   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司所属品牌  |
|  10   | FBRAND_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 加盟公司所属品牌  |
|  11   | FTYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 账户类型：合作/平台ElectronicAccountTypeEnum  |
|  12   | FWITHDRAW_WALLET_NAME |   varchar   | 60 |   0    |    Y     |  N   |       | 提现钱包账户名  |
|  13   | FKWITHDRAW_WALLET_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 提现钱包ID  |
|  14   | FQUERY_WALLET_NAME |   varchar   | 60 |   0    |    Y     |  N   |       | 查询钱包账户名  |
|  15   | FKQUERY_WALLET_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 查询钱包ID  |
|  16   | FCREATE_TIME |   timestamp   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | FUPDATE_TIME |   timestamp   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  18   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  19   | FCREATE_OPERATOR_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  20   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  21   | FUPDATE_OPERATOR_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  22   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  23   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_ewallet_record">t_finance_ewallet_record</a>

**说明：** 电子钱包

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  6   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌名称  |
|  7   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织（成交经纪人所属组织）  |
|  8   | FBROKER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 成交经纪人  |
|  9   | FWALLET_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 钱包类型  |
|  10   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  11   | FINCOME_PAY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 收支类型（收/支）  |
|  12   | FINCOME_PAY_CONTENT |   varchar   | 50 |   0    |    Y     |  N   |       | 收支类型（小类）  |
|  13   | FCATEGORY |   varchar   | 50 |   0    |    Y     |  N   |       | 查询钱包子类  |
|  14   | FSOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 来源  |
|  15   | FITEMS |   json   | 1073741824 |   0    |    Y     |  N   |       | 详情  |
|  16   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 支付手续费  |
|  17   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  18   | FDATE |   datetime   | 19 |   0    |    Y     |  N   |       | 交易时间  |
|  19   | FDESC |   varchar   | 50 |   0    |    Y     |  N   |       | 摘要  |
|  20   | FBILL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 单据号  |
|  21   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据id  |
|  22   | FSERIAL_NUMBER |   varchar   | 300 |   0    |    Y     |  N   |       | 流水号  |
|  23   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 来源ID  |
|  24   | FSOURCE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 来源编号  |
|  25   | FFROM_ACCOUNT_NAME |   varchar   | 300 |   0    |    Y     |  N   |       | 付款账户名  |
|  26   | FFROM_ACCOUNT_BANK |   varchar   | 300 |   0    |    Y     |  N   |       | 付款账户开户行  |
|  27   | FFROM_ACCOUNT_NUMBER |   varchar   | 300 |   0    |    Y     |  N   |       | 付款账号  |
|  28   | FTO_ACCOUNT_NAME |   varchar   | 300 |   0    |    Y     |  N   |       | 入账账户  |
|  29   | FTO_ACCOUNT_NUMBER |   varchar   | 300 |   0    |    Y     |  N   |       | 入账账号  |
|  30   | FTO_ACCOUNT_BANK |   varchar   | 300 |   0    |    Y     |  N   |       | 入账账户开户行  |
|  31   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  32   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  33   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  34   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_ganged_settlement">t_finance_ganged_settlement</a>

**说明：** 联动结佣

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  3   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展id  |
|  4   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名  |
|  5   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  6   | FAPPLY_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  7   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  8   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  9   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态GangedSettleStatusEnum  |
|  10   | FSOURCE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型：外联、加盟  |
|  11   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  12   | FADVANCED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  13   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发佣金  |
|  14   | FKPAYOFF_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发放记录  |
|  15   | FPAYOFF_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 发放状态  |
|  16   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  17   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方城市公司（加盟公司、外联公司  |
|  18   | FKDISTRIBUTION_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  19   | FDISTRIBUTOR_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 分销方名称（公司名、账户名）  |
|  20   | FDISTRIBUTOR_BANK |   varchar   | 100 |   0    |    Y     |  N   |       | 分销方开户行  |
|  21   | FDISTRIBUTOR_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方账号  |
|  22   | FPAYOFF_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 结佣日期  |
|  23   | FKAUDIT_RECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务总审核记录  |
|  24   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核记录  |
|  25   | FCONFIRM_STATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 确认状态  |
|  26   | FCONFIRMER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人  |
|  27   | FSUBMIT_TO_CASHIER |   bit   | 1 |   0    |    Y     |  N   |   0    | 提交到出纳平台(1:是0:否)  |
|  28   | FCONFIRMER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人  |
|  29   | FCONFIRMER_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人组织  |
|  30   | FCONFIRMER_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳确认人组织  |
|  31   | FAILUE_REREASON |   varchar   | 400 |   0    |    Y     |  N   |       | 确认失败原因  |
|  32   | FCONFIRMATION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认日期  |
|  33   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  34   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  35   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  36   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  37   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  38   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  39   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  43   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_ganged_settle_item">t_finance_ganged_settle_item</a>

**说明：** 联动结佣成交单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  2   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展ID  |
|  3   | FKEXPAND_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同ID  |
|  4   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘ID  |
|  5   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  6   | FKSUBSCRIBE_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 成交单ID  |
|  7   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单编号  |
|  8   | FBIZ_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型  |
|  9   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  10   | FSUBSCRIBE_DATE |   date   | 10 |   0    |    Y     |  N   |       | 认购日期  |
|  11   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  12   | FTAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 税率  |
|  13   | FDEFAULT_TAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 默认税率  |
|  14   | FTAX_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额  |
|  15   | FTAX_AMOUNT_COMPLEMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 税额补足  |
|  16   | FADVANCED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  17   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发佣金  |
|  18   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  19   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  20   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体ID  |
|  21   | FKTRANSACTION_REPORT_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 三级交易报告ID  |
|  22   | FKGANGED_SETTLEMENT_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动结佣  |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方cuid  |
|  24   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分销方cuname  |
|  25   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_gnete_transfer">t_finance_gnete_transfer</a>

**说明：** 好易联转账记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FSUBMIT_TIME |   timestamp   | 23 |   0    |    N     |  N   |   CURRENT_TIMESTAMP(3)    |   |
|  3   | FKTRANSFER_ID |   varchar   | 50 |   0    |    N     |  N   |       | 转账流水  |
|  4   | FMCT_ORDER_NO |   varchar   | 50 |   0    |    N     |  N   |       | 商户订单号  |
|  5   | FSN |   varchar   | 50 |   0    |    N     |  N   |       | 明细流水号  |
|  6   | FEXT_IDX_NO |   varchar   | 50 |   0    |    N     |  N   |       | 外部索引号  |
|  7   | FFAIL_REASON |   varchar   | 50 |   0    |    Y     |  N   |       | 失败原因  |
|  8   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  9   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  10   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_new_settlement">t_finance_new_settlement</a>

**说明：** 新房结算

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交Id  |
|  3   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易单号  |
|  4   | FGARDEN_NAME |   varchar   | 50 |   0    |    N     |  N   |       | 楼盘名称  |
|  5   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  6   | FTENEMENT |   varchar   | 100 |   0    |    Y     |  N   |       | 物业名称  |
|  7   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展ID  |
|  8   | FKEXPAND_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同ID  |
|  9   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单号  |
|  10   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  11   | FTOTAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 营收总佣  |
|  12   | FTOTAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 合计拆分金额  |
|  13   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 本次拆分可结算佣金  |
|  14   | FAWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 本次拆分现金奖  |
|  15   | FADVANCE_BACK_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣扣回金额  |
|  16   | FCOOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 本次拆分合作佣金  |
|  17   | FSETTLEMENT_MONTH |   datetime   | 19 |   0    |    Y     |  N   |       | 结算月  |
|  18   | FKAUDIT_RECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核记录  |
|  19   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  20   | FAPPLY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 申请时间  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  22   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  23   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  25   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  29   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  30   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  31   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_new_settle_detail">t_finance_new_settle_detail</a>

**说明：** 结算详情

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算ID  |
|  3   | FKALLOCATION_ID |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  4   | FKASSIGN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分配ID  |
|  5   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交ID  |
|  6   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型：案场、分销  |
|  7   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  8   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分公司  |
|  9   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分公司  |
|  10   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  11   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  12   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  13   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  14   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金  |
|  15   | FCOOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金  |
|  16   | FAWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖  |
|  17   | FADVANCE_BACK_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣扣回金额  |
|  18   | FTOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  19   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  20   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  21   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  22   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  23   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  24   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  25   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_new_settle_fund">t_finance_new_settle_fund</a>

**说明：** 结算款项

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSOURCE_FUND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销/认筹收款单  |
|  3   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票ID  |
|  4   | FISSUE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 开票流水号  |
|  5   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单  |
|  6   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_platform_return">t_finance_platform_return</a>

**说明：** 平台费返还配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 方案名称  |
|  3   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  4   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  5   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  6   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  7   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合作公司  |
|  8   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 合作公司  |
|  9   | FPLATFORM_FEES_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 平台费比例  |
|  10   | FRETURN_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 返还比例  |
|  11   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 启用日期  |
|  12   | FEND_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 禁用日期  |
|  13   | FOPERATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  14   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体  |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  16   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  17   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  18   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  19   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  20   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  21   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  22   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  24   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  25   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  26   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement">t_finance_settlement</a>

**说明：** 结算单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 结算编号  |
|  4   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  5   | FSETTLE_FUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 结算款项类型  |
|  6   | FAPPLY_DATE |   date   | 10 |   0    |    Y     |  N   |       | 结算申请日期  |
|  7   | FAUDIT_DATE |   date   | 10 |   0    |    Y     |  N   |       | 结算日期/财务审核日期  |
|  8   | FSETTLEMENT_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 结算状态  |
|  9   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  10   | FTAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：税率  |
|  11   | FDEFAULT_TAX_RATE |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：默认税率  |
|  12   | FTAX_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：税额  |
|  13   | FTAX_AMOUNT_COMPLEMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：税额补足  |
|  14   | FADVANCED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  15   | FPLATFORM_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 平台费（合作经营费）  |
|  16   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 支付手续费  |
|  17   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发佣金  |
|  18   | FSUBSCRIBE_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动：新房交易ID  |
|  19   | FGANGED_SETTLEMENT_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动：新房结佣单ID  |
|  20   | FGANGED_SETTLE_NUMBER |   varchar   | 20 |   0    |    Y     |  N   |       | 联动：新房结佣单编号  |
|  21   | FKGANGED_ITEM_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动：新房结佣明细id  |
|  22   | FKPLATFORM_RETURN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台费配置ID  |
|  23   | FKFIN_AUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核人  |
|  24   | FFIN_AUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核人  |
|  25   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核记录  |
|  26   | FKBIZ_AUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人  |
|  27   | FBIZ_AUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人  |
|  28   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核记录  |
|  29   | FKFUNDS_TYPE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  30   | FFUNDS_TYPE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  31   | FKBUSINESS_ENTITY_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 经营主体  |
|  32   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  33   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  34   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  35   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  36   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  37   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  38   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  39   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  43   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 乐观锁  |
|  44   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement_assign">t_finance_settlement_assign</a>

**说明：** 结算分配明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSETTLEMENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算单  |
|  3   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易单  |
|  4   | FKEY |   varchar   | 64 |   0    |    Y     |  N   |       | 标识符  |
|  5   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型  |
|  6   | FASSIGN_TYPE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型描述  |
|  7   | FSERVICE_CHARGE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费类型  |
|  8   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  9   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  10   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  11   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  12   | FKAREA_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 片区  |
|  13   | FAREA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 片区  |
|  14   | FKBIG_REGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 大区  |
|  15   | FBIG_REGION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 大区  |
|  16   | FKSTORE_MANAGER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 店长  |
|  17   | FSTORE_MANAGER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 店长  |
|  18   | FRATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 比例  |
|  19   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 业绩金额  |
|  20   | FTAX_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：税额  |
|  21   | FTAX_AMOUNT_COMPLEMENT |   decimal   | 20 |   2    |    Y     |  N   |       | 联动单：税额补足  |
|  22   | FADVANCED_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 垫佣金额  |
|  23   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 支付手续费  |
|  24   | FPLATFORM_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 平台费（合作经营费）  |
|  25   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实发佣金  |
|  26   | FKMANAGER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 片区经理  |
|  27   | FMANAGER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 片区经理  |
|  28   | FKLEADER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 战区总监  |
|  29   | FLEADER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 战区总监  |
|  30   | FKCITY_MANAGER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市总  |
|  31   | FCITY_MANAGER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市总  |
|  32   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  33   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  34   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  35   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  36   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  37   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  38   | FKBUSINESS_ENTITY_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 经营主体  |
|  39   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  43   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  44   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  45   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  46   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement_data">t_finance_settlement_data</a>

**说明：** 结佣资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 100 |   0    |    Y     |  N   |       | 名称  |
|  3   | FKENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结佣单ID  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  5   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  6   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  10   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement_pause">t_finance_settlement_pause</a>

**说明：** 暂停结算

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | report  |
|  3   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 原因  |
|  4   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  5   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  6   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  8   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  9   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  10   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  11   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  12   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement_rule">t_finance_settlement_rule</a>

**说明：** 结算规则

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  4   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  5   | FKFUNDS_TYPE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  6   | FFUNDS_TYPE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  7   | FSTART_DATE |   date   | 10 |   0    |    Y     |  N   |       | 生效日期  |
|  8   | FEND_DATE |   date   | 10 |   0    |    Y     |  N   |       | 失效日期  |
|  9   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  10   | FTRANSACTION_TYPES |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型配置信息  |
|  11   | FCOMMISSION_STATUSES |   varchar   | 50 |   0    |    Y     |  N   |       | 收佣状态配置信息  |
|  12   | FSERVICE_FEE_ALL_COLLECTED |   tinyint   | 3 |   0    |    Y     |  N   |       | 交易服务费是否收齐  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_finance_settlement_rule_data">t_finance_settlement_rule_data</a>

**说明：** 结算规则内容

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKRULE_ID |   varchar   | 50 |   0    |    N     |  Y   |       | 所属规则  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  5   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  6   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  7   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  8   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_gnete_transfer">t_gnete_transfer</a>

**说明：** 好易联转账

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 版本号  |
|  3   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  4   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告编号  |
|  5   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  6   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据ID  |
|  7   | FBILL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 单据编号  |
|  8   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项  |
|  9   | FDESC |   varchar   | 50 |   0    |    Y     |  N   |       | 描述（入账备注）  |
|  10   | FORIGINAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分配金额（单位元）  |
|  11   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 支付渠道手续费（单位元）  |
|  12   | FAMOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 转账金额（单位为分、1元=100分）  |
|  13   | FKPAYER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方  |
|  14   | FKPAYER_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方账户  |
|  15   | FKFROM_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包ID  |
|  16   | FFROM_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转出钱包  |
|  17   | FTO_WALLET_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 入账账户类型  |
|  18   | FKPAYEE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方  |
|  19   | FKPAYEE_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方账户  |
|  20   | FKTO_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包ID  |
|  21   | FTO_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转入钱包  |
|  22   | FTRANSFER_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 转账状态  |
|  23   | FSUBMIT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 提交分账时间  |
|  24   | FFINISH_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 处理完成时间  |
|  25   | FFAIL_REASON |   varchar   | 50 |   0    |    Y     |  N   |       | 失败原因  |
|  26   | FMCT_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户订单号  |
|  27   | FSN |   varchar   | 50 |   0    |    Y     |  N   |       | 明细流水号  |
|  28   | FEXT_IDX_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 外部索引号  |
|  29   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  30   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  31   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  32   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  33   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  34   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  35   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  36   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  37   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  38   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  39   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  40   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay">t_incomepay</a>

**说明：** 收付款主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 收付单号  |
|  3   | FTRANSACTION_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 交易ID  |
|  4   | FPAYMENT_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 收付类型  |
|  5   | FPAYMENT_CLIENT |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款客户  |
|  6   | FPAYMENT_CLIENT_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 收付款客户类型  |
|  7   | FDEDUCTION_CLIENT |   varchar   | 44 |   0    |    Y     |  N   |       | 抵扣/留款客户  |
|  8   | FDEDUCTION_CLIENT_TYPE |   varchar   | 44 |   0    |    Y     |  N   |       | 抵、留客户类型  |
|  9   | FTOTAL_MONEY |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  10   | FPAYMENT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 收付款日期  |
|  11   | FAUDIT_STATUS |   varchar   | 40 |   0    |    Y     |  N   |       | 审核状态  |
|  12   | FCASH_MONEY_STATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 现金交款状态  |
|  13   | FPARAGRAPH_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 款项描述  |
|  14   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  15   | FORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 组织ID  |
|  16   | FORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 组织名称  |
|  17   | FBRAND_ORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 品牌  |
|  18   | FALLIANCE_ORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 加盟公司  |
|  19   | FALLIANCE_ORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 加盟公司  |
|  20   | FSTORE_ORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 店铺  |
|  21   | FSTORE_ORG_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 店铺的组织名称  |
|  22   | FBUSINESS_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 业务审核人  |
|  23   | FBUSINESS_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 业务审核人姓名  |
|  24   | FBUSINESS_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 业务审核时间  |
|  25   | FFINANCE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 财务审核人  |
|  26   | FFINANCE_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 财务审核人姓名  |
|  27   | FFINANCE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 财务审核时间  |
|  28   | FROLLBACK_REASON |   varchar   | 200 |   0    |    Y     |  N   |       | 驳回原因  |
|  29   | FROLLBACK_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人  |
|  30   | FROLLBACK_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人姓名  |
|  31   | FROLLBACK_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 驳回时间  |
|  32   | FKGANGED_SOURCE_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动单新房收款ID  |
|  33   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  34   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  35   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  36   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  37   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  38   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  39   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_account">t_incomepay_account</a>

**说明：** 收付款账户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FINCOMEPAY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款主表ID  |
|  3   | FINCOMEPAY_METHODS |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款方式  |
|  4   | FACCOUNT_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 账户ID  |
|  5   | FACCOUNT_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款公司名  |
|  6   | FBANK_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款银行名称  |
|  7   | FCARD_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款卡号  |
|  8   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  9   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  12   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  13   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_advance_refund">t_incomepay_advance_refund</a>

**说明：** 垫佣退回

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  3   | FKADVANCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣单Id  |
|  4   | FADVANCE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣编号  |
|  5   | FKADVANCE_BILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 垫佣成交单Id  |
|  6   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单Id  |
|  7   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单编号  |
|  8   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  9   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名称  |
|  10   | FACCOUNT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 付款账户名  |
|  11   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方式  |
|  12   | FENDPOINT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | pos终端号  |
|  13   | FREF_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 流水号/参考号  |
|  14   | FNOTE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | pos终端号  |
|  15   | FKACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款账户Id  |
|  16   | FDISTRIBUTOR_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分销类型：外联、加盟  |
|  17   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 退回金额  |
|  18   | FRECEIVABLE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 应收金额  |
|  19   | FSERVICE_FEE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 服务费  |
|  20   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  21   | FBIZ_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 收款日期  |
|  22   | FLEDGER_MONTH |   datetime   | 19 |   0    |    Y     |  N   |       | 总账月  |
|  23   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  24   | FCONFIRM_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 确认状态  |
|  25   | FREASON_FAILURE |   varchar   | 50 |   0    |    Y     |  N   |       | 确认失败原因  |
|  26   | FCASHIER_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 出纳确认时间  |
|  27   | FKACCOUNTANT_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 会计审核  |
|  28   | FKCASHIER_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳审核  |
|  29   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  30   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  31   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  32   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  33   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  34   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  35   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  36   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  37   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  38   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  39   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  40   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_bank_statement">t_incomepay_bank_statement</a>

**说明：** 银商对账单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FDATE |   timestamp   | 23 |   0    |    N     |  N   |   CURRENT_TIMESTAMP(3)    | 录入表的时间  |
|  3   | FKINCOMEPAY_OTHER_ACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 对应表-收付款对方账户id  |
|  4   | FTERMINAL_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 终端编号  |
|  5   | FMCT_ORDER |   varchar   | 50 |   0    |    Y     |  N   |       | 商户订单号  |
|  6   | FBUSINESS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型  |
|  7   | FTRANS_TYPE |   varchar   | 15 |   0    |    Y     |  N   |       | 交易类型  |
|  8   | FPAY_WAY |   varchar   | 15 |   0    |    Y     |  N   |       | 支付方式  |
|  9   | FCLEAR_DATE |   varchar   | 50 |   0    |    Y     |  N   |       | 清算日期  |
|  10   | FTRANS_DATE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易日期  |
|  11   | FTRANS_TIME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易时间  |
|  12   | FTRANS_AMT |   varchar   | 10 |   0    |    Y     |  N   |       | 交易金额  |
|  13   | FFEE_AMT |   varchar   | 10 |   0    |    Y     |  N   |       | 日结手续费  |
|  14   | FFEE_TOTAL_AMT |   varchar   | 10 |   0    |    Y     |  N   |       | 总手续费  |
|  15   | FSETT_AMT |   varchar   | 10 |   0    |    Y     |  N   |       | 入账金额  |
|  16   | FVENDOR_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户编号  |
|  17   | FVENDOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 商户名称  |
|  18   | FBANK_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 卡号  |
|  19   | FBANK_TYPE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 卡种名称  |
|  20   | FBANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 卡名称  |
|  21   | FBANK_ISSUER |   varchar   | 50 |   0    |    Y     |  N   |       | 发卡机构名称  |
|  22   | FACQUIRER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 收单机构名称  |
|  23   | FTERMINAL_SN |   varchar   | 50 |   0    |    Y     |  N   |       | 终端流水号  |
|  24   | FSEARCH_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 检索参考号  |
|  25   | FKCHANNEL_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 渠道订单号  |
|  26   | FTRANS_NOTE |   varchar   | 250 |   0    |    Y     |  N   |       | 交易附言  |
|  27   | FTRANS_REMARKS |   varchar   | 250 |   0    |    Y     |  N   |       | 交易备注  |
|  28   | FLABEL_A |   varchar   | 250 |   0    |    Y     |  N   |       | 附加域1  |
|  29   | FLABEL_B |   varchar   | 250 |   0    |    Y     |  N   |       | 附加域2  |
|  30   | FRETAIN_A |   varchar   | 250 |   0    |    Y     |  N   |       | 保留域1  |
|  31   | FRETAIN_B |   varchar   | 250 |   0    |    Y     |  N   |       | 保留域2  |
|  32   | FCUSTOM_A |   varchar   | 250 |   0    |    Y     |  N   |       | 自定义域1  |
|  33   | FCUSTOM_B |   varchar   | 250 |   0    |    Y     |  N   |       | 自定义域2  |
|  34   | FCUSTOM_C |   varchar   | 250 |   0    |    Y     |  N   |       | 自定义域3  |
|  35   | FCUSTOM_D |   varchar   | 250 |   0    |    Y     |  N   |       | 自定义域4  |
|  36   | FCUSTOM_E |   varchar   | 250 |   0    |    Y     |  N   |       | 自定义域5  |
|  37   | FFIELD_A |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域1  |
|  38   | FFIELD_B |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域2  |
|  39   | FFIELD_C |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域3  |
|  40   | FFIELD_D |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域4  |
|  41   | FFIELD_E |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域5  |
|  42   | FFIELD_F |   varchar   | 250 |   0    |    Y     |  N   |       | 业务自定义域6  |
|  43   | FKCU_ID |   varchar   | 25 |   0    |    Y     |  N   |       |   |
|  44   | FKBRAND_ORG_ID |   varchar   | 25 |   0    |    Y     |  N   |       |   |
|  45   | FKALLIANCE_ORG_ID |   varchar   | 25 |   0    |    Y     |  N   |       |   |
|  46   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_bank_statement_flag">t_incomepay_bank_statement_flag</a>

**说明：** 银商对账单结果

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKEYS |   varchar   | 50 |   0    |    Y     |  N   |       | 关键字  |
|  3   | FYES_OR_NO_ENUM |   varchar   | 50 |   0    |    Y     |  N   |       | 拉取结果  |
|  4   | FACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 账户  |
|  5   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_cashier_income">t_incomepay_cashier_income</a>

**说明：** 新房出纳平台-收款

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 收款类型  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 收款编号  |
|  4   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 来源ID  |
|  5   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据ID  |
|  6   | FBIZ_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 其他业务编号  |
|  7   | FKACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款账号  |
|  8   | FACCOUNT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 账户名称  |
|  9   | FACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 账户号码  |
|  10   | FBANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 银行  |
|  11   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 收款金额  |
|  12   | FBIZ_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 收款日期  |
|  13   | FREF_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 系统参考号（流水号）  |
|  14   | FTARGET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 对方账户  |
|  15   | FCONFIRM_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 确认情况  |
|  16   | FKCONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 确认人  |
|  17   | FCONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认日期  |
|  18   | FFAIL_REASON |   varchar   | 50 |   0    |    Y     |  N   |       | 原因  |
|  19   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方式  |
|  20   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  21   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  22   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  23   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  24   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  25   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  26   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  27   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  28   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  29   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  30   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  31   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_cashier_pay">t_incomepay_cashier_pay</a>

**说明：** 新房出纳平台-付款

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款类型  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 付款编号  |
|  4   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 来源ID  |
|  5   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据ID  |
|  6   | FBIZ_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 其他业务编号  |
|  7   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名称  |
|  8   | FKACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收款账号  |
|  9   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 付款金额  |
|  10   | FTARGET_ACCOUNT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 对方账户  |
|  11   | FTARGET_ACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 对方账户  |
|  12   | FBIZ_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 收款日期  |
|  13   | FREF_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 系统参考号（流水号）  |
|  14   | FTARGET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 对方账户  |
|  15   | FCONFIRM_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 确认情况  |
|  16   | FKCONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 确认人  |
|  17   | FCONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认日期  |
|  18   | FFAIL_REASON |   varchar   | 50 |   0    |    Y     |  N   |       | 原因  |
|  19   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方式  |
|  20   | FGARDEN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘类型（已代理、未代理）  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  22   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  23   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  25   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  28   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  30   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  31   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_distribution_fund">t_incomepay_distribution_fund</a>

**说明：** 分销款

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 收款单号  |
|  3   | FRECEIVE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 收款状态  |
|  4   | FGARDEN_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 楼盘名  |
|  5   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  6   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展  |
|  7   | FKEXPAND_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同  |
|  8   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票ID  |
|  9   | FINVOICE_ISSUE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 开票流水  |
|  10   | FBIZ_TARGET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 付款账户名  |
|  11   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方式  |
|  12   | FENDPOINT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | POS终端号  |
|  13   | FKACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 我方资金账户  |
|  14   | FBIZ_DATE |   date   | 10 |   0    |    Y     |  N   |       | 收款日期  |
|  15   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 收款金额  |
|  16   | FREF_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 流水号、参考号  |
|  17   | FKCREATE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人组织  |
|  18   | FCREATE_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人组织  |
|  19   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  20   | FKACCOUNTANT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 会计  |
|  21   | FACCOUNTANT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 会计  |
|  22   | FKCASHIER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳  |
|  23   | FCASHIER_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳  |
|  24   | FKCASHIER_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳审核  |
|  25   | FKACCOUNTANT_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 会计审核  |
|  26   | FLEDGER_MONTH |   date   | 10 |   0    |    Y     |  N   |       | 总账月  |
|  27   | FARRIVAL_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 收款类型  |
|  28   | FCONFIRM_STATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 确认状态  |
|  29   | FAILUE_REREASON |   varchar   | 400 |   0    |    Y     |  N   |       | 确认失败原因  |
|  30   | FCONFIRMATION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认日期  |
|  31   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  32   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  33   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  34   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  35   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  36   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  37   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  38   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  39   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  43   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_distribution_fund_detail">t_incomepay_distribution_fund_detail</a>

**说明：** 分销收款内容

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单ID  |
|  3   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  4   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  5   | FKINCOME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销收款ID  |
|  6   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息ID  |
|  7   | FTOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 总额  |
|  8   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金  |
|  9   | FCOOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金  |
|  10   | FAWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖  |
|  11   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  12   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_gnete_transaction">t_incomepay_gnete_transaction</a>

**说明：** 好易联交易明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FTRANS_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 交易订单号  |
|  3   | FKWALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 钱包ID  |
|  4   | FWALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 钱包名称  |
|  5   | FKOTHER_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 对方钱包ID  |
|  6   | FOTHER_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 对方钱包名称  |
|  7   | FCOADMIN_ACCT_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 共管子账号  |
|  8   | FCOADMIN_ACCT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 共管子账号名称  |
|  9   | FTRANS_DATE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易日期  |
|  10   | FTRANS_TIME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易时间  |
|  11   | FTRANS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易类型编码  |
|  12   | FTRANS_TYPE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易类型名称  |
|  13   | FMER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户号  |
|  14   | FMER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 商户简称  |
|  15   | FTRANS_AMT |   varchar   | 50 |   0    |    Y     |  N   |       | 交易金额  |
|  16   | FCOADMIN_AMT |   varchar   | 50 |   0    |    Y     |  N   |       | 共管金额  |
|  17   | FAVLBL_AMT |   varchar   | 50 |   0    |    Y     |  N   |       | 可用金额  |
|  18   | FSETT_AMT |   varchar   | 50 |   0    |    Y     |  N   |       | 清算金额  |
|  19   | FSETT_DATE |   varchar   | 50 |   0    |    Y     |  N   |       | 清算日期  |
|  20   | FPROC_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 处理状态  |
|  21   | FPROC_STATUS_DSCRB |   varchar   | 50 |   0    |    Y     |  N   |       | 状态描述  |
|  22   | FPROC_RESULT_DSCRB |   varchar   | 50 |   0    |    Y     |  N   |       | 处理结果描述  |
|  23   | FADJUST_FLAG |   varchar   | 50 |   0    |    Y     |  N   |       | 调整标记  |
|  24   | FMCT_ORDER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 商户订单号  |
|  25   | FBANK_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 银行行号  |
|  26   | FBANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 银行名称  |
|  27   | FBANK_ACCT_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 银行卡号  |
|  28   | FBANK_ACCT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 银行户名  |
|  29   | FKREG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 批次号  |
|  30   | FREG_DTL_SN |   varchar   | 50 |   0    |    Y     |  N   |       | 批次明细号  |
|  31   | FABST |   varchar   | 50 |   0    |    Y     |  N   |       | 摘要  |
|  32   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  33   | FTRANS_FEE |   varchar   | 50 |   0    |    Y     |  N   |       | 交易手续费  |
|  34   | FKTRANS_FEE_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易手续费入账钱包id  |
|  35   | FTRANS_FEE_WALLET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易手续费入账钱包名称  |
|  36   | FAMT_SYMBOL |   varchar   | 50 |   0    |    Y     |  N   |       | 资金符号  |
|  37   | FKCPTL_PLN_PRJCT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 资金计划项目ID  |
|  38   | FCPTL_PLN_PRJCT_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 资金计划项目编号  |
|  39   | FCPTL_PLN_PRJCT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 资金计划项目名称  |
|  40   | FPAY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款类型  |
|  41   | FPAY_BANK_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款银行行号  |
|  42   | FPAY_BANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 付款银行名称  |
|  43   | FPAY_BANK_ACCT_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 付款银行卡号  |
|  44   | FPAY_BANK_ACCT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 付款银行账户名称  |
|  45   | FHYL_RCV_FEE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  46   | FKHYL_RCV_FEE_WALLET_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  47   | FIS_TIMEOUT_REEXCHANG |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  48   | FPROC_TIME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  49   | FRCV_TIME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  50   | FROW_MODIFY_TIME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
**表名：** <a id="t_incomepay_info">t_incomepay_info</a>

**说明：** 收付款数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FINCOMEPAY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款主表ID  |
|  3   | FTRANSACTION_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 交易ID  |
|  4   | FBUILD_IN_FUNDS_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 默认款项类型  |
|  5   | FKPAYMENT_CONFIGURE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型ID  |
|  6   | FMONEY_TYPE |   varchar   | 44 |   0    |    Y     |  N   |       | 类型  |
|  7   | FPARAGRAPH_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 款项ID  |
|  8   | FPARAGRAPH_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 款项  |
|  9   | FMONEY |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  10   | FCHANNEL_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 支付通道手续费  |
|  11   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  12   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  15   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  16   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  17   | FENABLE |   varchar   | 10 |   0    |    Y     |  N   |       |   |
|  18   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_other_account">t_incomepay_other_account</a>

**说明：** 收付款对方账户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FCASHIER_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 出纳单号  |
|  3   | FKINCOMEPAY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收付款ID  |
|  4   | FINCOMEPAY_ACCOUNT_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 收付款账户ID  |
|  5   | FBANK_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 对方银行  |
|  6   | FDEPOSIT_BANK |   varchar   | 44 |   0    |    Y     |  N   |       | 开户行  |
|  7   | FACCOUNT_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 账户名称  |
|  8   | FACCOUNT_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 账号  |
|  9   | FORDER_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 交易号/参考号/订单号  |
|  10   | FMONEY |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  11   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 手续费  |
|  12   | FACTUAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 到账金额  |
|  13   | FCASHIER_STATUS |   varchar   | 44 |   0    |    Y     |  N   |       | 出纳状态  |
|  14   | FCASHIER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 出纳确认人  |
|  15   | FCASHIER_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 出纳确认人姓名  |
|  16   | FCASHIER_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 出纳确认时间  |
|  17   | FCASH_PAYMENT_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 现金交款时间  |
|  18   | FCASH_PAYMENT_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 现金交款人  |
|  19   | FCASH_PAYMENT_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 现金交款人姓名  |
|  20   | FORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 现金交款确认人组织ID  |
|  21   | FORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 现金交款确认人组织名称  |
|  22   | FSTATUS |   varchar   | 11 |   0    |    Y     |  N   |   DISABLED    | 状态ENABLED(启用),DISABLED(禁用)  |
|  23   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  24   | FROLLBACK_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人  |
|  25   | FROLLBACK_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 驳回时间  |
|  26   | FROLLBACK_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人姓名  |
|  27   | FROLLBACK_REASON |   varchar   | 200 |   0    |    Y     |  N   |       | 驳回原因  |
|  28   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  29   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  30   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  31   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  32   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  33   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  34   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_payment_big_type_configure">t_incomepay_payment_big_type_configure</a>

**说明：** 款项配置大类

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FNAME |   varchar   | 150 |   0    |    Y     |  N   |       | 大类名称  |
|  3   | FIS_DEFAULT |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否默认  |
|  4   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  5   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  6   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_payment_configure">t_incomepay_payment_configure</a>

**说明：** 款项配置子类

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FCITY |   varchar   | 150 |   0    |    Y     |  N   |       | 城市  |
|  4   | FNAME |   varchar   | 150 |   0    |    Y     |  N   |       | 款项名称  |
|  5   | FENTRY_TYPE |   varchar   | 150 |   0    |    Y     |  N   |   CUSTOM    | 实体类型（关联具有意义的枚举）  |
|  6   | FBIG_TYPE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 所属大类的id  |
|  7   | FBIG_TYPE_NAME |   varchar   | 20 |   0    |    Y     |  N   |       | 所属大类的名称  |
|  8   | FBUILD_IN_FUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 内置款项类型  |
|  9   | FAPPLY_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型(多个用字符串拼接)  |
|  10   | FSTATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 状态ENABLED(启用),DISABLED(禁用)  |
|  11   | FIS_DEFAULT |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否默认  |
|  12   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  13   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  16   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  17   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  18   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  19   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  20   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  21   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_incomepay_recincomepay">t_incomepay_recincomepay</a>

**说明：** 认筹收付款

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKRECOGNIZE_CHIPS_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹ID  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 收付款类型  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 收付款状态  |
|  6   | FBIZ_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 业务日期  |
|  7   | FBIZ_TARGET |   varchar   | 50 |   0    |    Y     |  N   |       | 业务对象  |
|  8   | FBIZ_TARGET_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业务对象名称  |
|  9   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 收款方式  |
|  10   | FENDPOINT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | POS终端号  |
|  11   | FNOTE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 票据编号  |
|  12   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  13   | FREF_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 流水号、参考号  |
|  14   | FKACCOUNT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 我方资金账户  |
|  15   | FREMARK |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
|  16   | FLEDGER_MONTH |   datetime   | 19 |   0    |    Y     |  N   |       | 总账月  |
|  17   | FACCOUNTANT_AUDIT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 会计审核日期  |
|  18   | FKACCOUNTANT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 会计  |
|  19   | FACCOUNTANT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 会计  |
|  20   | FCASHIER_AUDIT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 出纳审核日期  |
|  21   | FKCASHIER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳  |
|  22   | FCASHIER_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳  |
|  23   | FAUDIT_REMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 审核备注  |
|  24   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分公司  |
|  25   | FCREATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 收款录入人  |
|  26   | FKINCOME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 退款单对应的收款单ID  |
|  27   | FACCOUNT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 对方账户名  |
|  28   | FBANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 银行  |
|  29   | FBRANCH_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开户行  |
|  30   | FACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 账号  |
|  31   | FREASON |   varchar   | 255 |   0    |    Y     |  N   |       | 退款原因  |
|  32   | FCONFIRM_STATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 确认状态  |
|  33   | FAILUE_REREASON |   varchar   | 400 |   0    |    Y     |  N   |       | 确认失败原因  |
|  34   | FCONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 确认日期  |
|  35   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  36   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  37   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  38   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  39   | FKACCOUNTANT_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 会计审核  |
|  40   | FKCASHIER_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 出纳审核  |
|  41   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  42   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  43   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  44   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  45   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  46   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  47   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  48   | FKINVOICE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息ID  |
|  49   | FINVOICE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 发票状态  |
|  50   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_electronicreceiptconfig">t_note_electronicreceiptconfig</a>

**说明：** 电子收据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 收据名称  |
|  4   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  5   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  6   | FFILE_URL |   varchar   | 200 |   0    |    Y     |  N   |       | logo地址  |
|  7   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态OperateTypeEnum  |
|  8   | FTEMPLATE_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 模板地址  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_electronic_receipt">t_note_electronic_receipt</a>

**说明：** 电子收据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKNOTE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 票据  |
|  3   | FFULL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 完整票据号  |
|  4   | FKCONFIG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 配置项  |
|  5   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  6   | FBIZ_TYPE_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 交款类型  |
|  7   | FPARAGRAPH_NAMES |   varchar   | 50 |   0    |    Y     |  N   |       | 款项  |
|  8   | FPAYMENT_METHODS |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方式  |
|  9   | FBIZ_TARGET |   varchar   | 50 |   0    |    Y     |  N   |       | 业务对象  |
|  10   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  11   | FFILE_URL |   varchar   | 500 |   0    |    Y     |  N   |       | PDF文件  |
|  12   | FINVALIDATED_FILE_URL |   varchar   | 500 |   0    |    Y     |  N   |       | 作废票据PDF  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司  |
|  20   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invalidtoinvoice">t_note_invalidtoinvoice</a>

**说明：** 作废换发票子项

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKRECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 操作记录  |
|  3   | FINVOICE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 发票类型  |
|  4   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 发票编号  |
|  5   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  6   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invoice_adjust">t_note_invoice_adjust</a>

**说明：** 新房发票调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |   KFANG    | 数据来源  |
|  3   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织  |
|  4   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织名称  |
|  5   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票id  |
|  6   | FINVOICE_SERIAL_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 开票流水号  |
|  7   | FINVOICE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 开票金额  |
|  8   | FREASON |   varchar   | 300 |   0    |    Y     |  N   |       | 调整原因  |
|  9   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘  |
|  10   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘  |
|  11   | FKAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  12   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 审核状态  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  22   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  23   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invoice_adjust_detail">t_note_invoice_adjust_detail</a>

**说明：** 新房发票调整明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKADJUST_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发票调整主表id  |
|  3   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易id  |
|  4   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  5   | FPROPERTY |   varchar   | 50 |   0    |    Y     |  N   |       | 物业  |
|  6   | FCOMMISSION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 佣金类型  |
|  7   | FBEFORE_FIXING_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金调整前金额  |
|  8   | FAFTER_FIXING_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金调整后金额  |
|  9   | FBEFORE_FIXING_COOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金调整前金额  |
|  10   | FAFTER_FIXING_COOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金调整后金额  |
|  11   | FBEFORE_FIXING_AWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖调整前金额  |
|  12   | FAFTER_FIXING_AWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖调整后金额  |
|  13   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 本次开票金额  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  16   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  17   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  18   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  19   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  20   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  23   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  24   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  25   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invoice_content">t_note_invoice_content</a>

**说明：** 开票内容配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FCONTENT |   varchar   | 50 |   0    |    Y     |  N   |       | 开票内容  |
|  3   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  4   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  5   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  6   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  7   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  8   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  9   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  10   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  11   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  12   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  13   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  14   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  15   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invoice_issue">t_note_invoice_issue</a>

**说明：** 开票信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKTITLE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 抬头  |
|  3   | FKISSUE_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票公司  |
|  4   | FKISSUE_COMPANY_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 开票公司编码  |
|  5   | FKSIGN_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票主体  |
|  6   | FSIGN_COMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开票主体  |
|  7   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 流水号  |
|  8   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展  |
|  9   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名  |
|  10   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  11   | FGARDEN_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘编号  |
|  12   | FKCONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同  |
|  13   | FCONTRACT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 合同  |
|  14   | FINVOICE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 发票类型  |
|  15   | FISSUE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 开票状态  |
|  16   | FCONTENT |   varchar   | 50 |   0    |    Y     |  N   |       | 开具内容  |
|  17   | FKAUDIT_RECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核信息  |
|  18   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  19   | FTOTAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 总金额  |
|  20   | FISSUE_DATE |   date   | 10 |   0    |    Y     |  N   |       | 开票日期  |
|  21   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  22   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  23   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  24   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  25   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  26   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  27   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  28   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  29   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  30   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  31   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  32   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  33   | FRETURN_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 退票审核操作人员姓名  |
|  34   | FRETURN_OPERATOR_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 退票审核操作时间  |
|  35   | FRETURN_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  36   | FNOTE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹款收据号  |
|  37   | FINCOME_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹收款编号  |
|  38   | FDISTRIBUTION_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 收款情况  |
|  39   | FINCOME_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 收款金额  |
|  40   | FSETTLE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  41   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_invoice_newh">t_note_invoice_newh</a>

**说明：** 新房发票

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 发票类型  |
|  3   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息  |
|  4   | FCODE |   varchar   | 50 |   0    |    Y     |  N   |       | 发票代码  |
|  5   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 发票号码  |
|  6   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 开票金额  |
|  7   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  8   | FDATE |   date   | 10 |   0    |    Y     |  N   |       | 开票日期  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FKREVERSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 红冲发票ID  |
|  16   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_issue_funds">t_note_issue_funds</a>

**说明：** 开票款项信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单  |
|  3   | FKREC_INCOME_PAY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹收款ID  |
|  4   | FKRECOGNIZE_CHIPS_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹ID  |
|  5   | FKISSUE_SUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票成交信息  |
|  6   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息  |
|  7   | FFUNDS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 款项类型  |
|  8   | FTOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 总额  |
|  9   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金  |
|  10   | FCOOPERATION |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金  |
|  11   | FAWARD |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖  |
|  12   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_issue_subscribe">t_note_issue_subscribe</a>

**说明：** 开票成交信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单  |
|  3   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息  |
|  4   | FKISSUE_FUNDS_INFO_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票款项  |
|  5   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  6   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  8   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  11   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  12   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKREC_INCOME_PAY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹收款ID  |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_note">t_note_note</a>

**说明：** 票据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FPREFIX |   varchar   | 50 |   0    |    Y     |  N   |       | 编号前缀  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告ID  |
|  5   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 大类  |
|  6   | FSUB_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 小类  |
|  7   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 开票金额  |
|  8   | FCONTENT |   varchar   | 200 |   0    |    Y     |  N   |       | 填开内容（描述）  |
|  9   | FITEMS |   varchar   | 50 |   0    |    Y     |  N   |       | 填开项目（款项）  |
|  10   | FFILL_IN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 填开名称（名称）  |
|  11   | FKFILL_IN_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 填开人  |
|  12   | FFILL_IN_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 填开人  |
|  13   | FKFILL_IN_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 填开组织  |
|  14   | FFILL_IN_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 填开组织  |
|  15   | FFILL_IN_DATE |   date   | 10 |   0    |    Y     |  N   |       | 填开日期  |
|  16   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  17   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收据、发票ID  |
|  18   | FNOTE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 票据名称  |
|  19   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 票据状态  |
|  20   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司  |
|  21   | FKINVALIDATE_RECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 作废记录  |
|  22   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  23   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  24   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  25   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  26   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  27   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  28   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  29   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  30   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  31   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_note_funds">t_note_note_funds</a>

**说明：** 开票款项明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKNOTE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 票据  |
|  3   | FKINCOME_PAY_INFO_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 收付款明细  |
|  4   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  5   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  6   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_note_record">t_note_note_record</a>

**说明：** 票据操作记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKNOTE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 票据  |
|  3   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 操作类型  |
|  4   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注、原因  |
|  5   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 操作组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 操作组织  |
|  7   | FKOPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 操作人  |
|  8   | FOPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 操作人  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_return_invoice">t_note_return_invoice</a>

**说明：** 退票申请

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKINVOICE_ISSUE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开票信息id  |
|  3   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 原因  |
|  4   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织id  |
|  5   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织名  |
|  6   | FKAUDIT_RECORD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核信息  |
|  7   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  8   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_note_title">t_note_title</a>

**说明：** 发票抬头

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  3   | FCERTIFICATE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号  |
|  4   | FADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  5   | FBANK |   varchar   | 50 |   0    |    Y     |  N   |       | 银行  |
|  6   | FTELEPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 电话  |
|  7   | FACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 账户  |
|  8   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  10   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_address_confirmation">t_sign_address_confirmation</a>

**说明：** 地址确认书

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FCERTIFICATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 房产证地址  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FCOMMUNICATION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  6   | FCOMMUNICATION_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 联系电话  |
|  7   | FCOMMUNICATION_EMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 电子邮箱  |
|  8   | FCOMMUNICATION_ADDRESS |   varchar   | 50 |   0    |    Y     |  N   |       | 送达地址  |
|  9   | FTARGET |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  11   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  12   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  13   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  14   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  15   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  16   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  18   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  19   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  20   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_cancel_agreement">t_sign_cancel_agreement</a>

**说明：** 撤单协议-电子

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告id  |
|  3   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  6   | FOWNER_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 业主交易服务费  |
|  7   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  8   | FCUSTOMER_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 客户交易服务费  |
|  9   | FREASON |   varchar   | 300 |   0    |    Y     |  N   |       | 解除原因  |
|  10   | FINDEMNITY_AGREEMENT |   varchar   | 300 |   0    |    Y     |  N   |       | 客业双方违约赔偿协议  |
|  11   | FRETURN_AGREEMENT |   varchar   | 300 |   0    |    Y     |  N   |       | 其他款项及文件返还达成协议  |
|  12   | FOTHER_AGREEMENT |   varchar   | 300 |   0    |    Y     |  N   |       | 合同解除后的其他约定  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  20   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  21   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  22   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  23   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_commission_agreement">t_sign_commission_agreement</a>

**说明：** 佣金协议

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次ID  |
|  3   | FMAIN_CONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 主合同编号  |
|  4   | FTARGET |   varchar   | 50 |   0    |    Y     |  N   |       | 协议履行方  |
|  5   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  6   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 数额  |
|  7   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  8   | FREMARK |   varchar   | 500 |   0    |    Y     |  N   |       | 备注  |
|  9   | TRANSACTION_SERVICE_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  11   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  12   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  13   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  14   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  15   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  16   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  17   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  18   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  19   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  20   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_contract">t_sign_contract</a>

**说明：** 合同

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FKTEMPLATE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同模板  |
|  5   | FCATEGORY |   varchar   | 50 |   0    |    Y     |  N   |       | 合同类别  |
|  6   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 合同名  |
|  7   | FPLATFORM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约平台合同ID  |
|  8   | FKINITIATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人  |
|  9   | FINITIATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人  |
|  10   | FKINITIATE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发起组织  |
|  11   | FINITIATE_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 发起组织  |
|  12   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 合同状态  |
|  13   | FFINISH_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 签署完成日期  |
|  14   | FUNSIGNED_FILE |   varchar   | 100 |   0    |    Y     |  N   |       | 未签署合同文件  |
|  15   | FSIGNED_FILE |   varchar   | 100 |   0    |    Y     |  N   |       | 签署完成文件  |
|  16   | FEXPIRE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 过期时间  |
|  17   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据ID  |
|  18   | FFILLED |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否已归档  |
|  19   | FAGENCY_SIGN |   tinyint   | 3 |   0    |    Y     |  N   |       | 公司是否签署  |
|  20   | FIDENTIFIER |   varchar   | 50 |   0    |    Y     |  N   |       | 标识符  |
|  21   | FKOLD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 重签前ID  |
|  22   | FRESIGNING |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否重签中  |
|  23   | FKAUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人ID  |
|  24   | FAUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  25   | FREVOKE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 解除日期  |
|  26   | FCANCEL_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 撤销日期  |
|  27   | FSENT_SMS |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否已发送短信  |
|  28   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  29   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  30   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  31   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  32   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  33   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  34   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  35   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  36   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  37   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  38   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  39   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  40   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 乐观锁版本  |
**表名：** <a id="t_sign_customer">t_sign_customer</a>

**说明：** 合同签署客户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FKBROKER_CUSTOMER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 盘客customerId;  |
|  4   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  5   | FCERTIFICATE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号码  |
|  6   | FCERTIFICATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型  |
|  7   | FCELLPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号  |
|  8   | FEMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 邮箱  |
|  9   | FNATIONALITY |   varchar   | 50 |   0    |    Y     |  N   |       | 国籍  |
|  10   | FCERTIFICATE_VALIDITY_BEGIN |   date   | 10 |   0    |    Y     |  N   |       | 证件有效期开始  |
|  11   | FCERTIFICATE_VALIDITY_END |   date   | 10 |   0    |    Y     |  N   |       | 证件有效期结束  |
|  12   | FCERTIFICATE_IMAGE_A |   varchar   | 200 |   0    |    Y     |  N   |       | 证件照片1  |
|  13   | FCERTIFICATE_IMAGE_B |   varchar   | 200 |   0    |    Y     |  N   |       | 证件照片2  |
|  14   | FCOMMUNICATE_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 联系地址  |
|  15   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 联系人类型  |
|  16   | FENTERPRISE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 企业类型  |
|  17   | FENTERPRISE_PERSON |   varchar   | 50 |   0    |    Y     |  N   |       | 企业签署人身份  |
|  18   | FKAGENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人ID  |
|  19   | FINDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 排序  |
|  20   | FAGENT_INDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人索引  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  22   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  23   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  25   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  28   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  30   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  31   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_draft">t_sign_draft</a>

**说明：** 电子签-草稿

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKHOUSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 房源信息id  |
|  3   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人（成交人）  |
|  4   | FKEY |   varchar   | 50 |   0    |    Y     |  N   |       | 关键字  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 编辑状态  |
|  6   | FCONTENT |   json   | 1073741824 |   0    |    Y     |  N   |       | 内容json格式  |
|  7   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  14   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  15   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  16   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  17   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  18   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_furniture">t_sign_furniture</a>

**说明：** 家私清单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次ID  |
|  3   | FMAIN_CONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 主合同编号  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  5   | FELECTRIC_METER_READING |   varchar   | 50 |   0    |    Y     |  N   |       | 电表度数  |
|  6   | FWATER_METER_READING |   varchar   | 50 |   0    |    Y     |  N   |       | 水表度数  |
|  7   | FGAS_METER_READING |   varchar   | 50 |   0    |    Y     |  N   |       | 燃气度数  |
|  8   | FADDENDUM |   varchar   | 100 |   0    |    Y     |  N   |       | 其它补充  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  16   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  18   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  19   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_furniture_items">t_sign_furniture_items</a>

**说明：** 家私清单子项

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       | id  |
|  2   | FKTHE_MAIN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 家私主表id  |
|  3   | FCATEGORY |   varchar   | 50 |   0    |    Y     |  N   |       | 家私种类  |
|  4   | FCOUNT |   varchar   | 20 |   0    |    Y     |  N   |       | 数量  |
|  5   | FMODEL |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌  |
|  6   | FWASTAGE |   varchar   | 50 |   0    |    Y     |  N   |       | 新旧程度  |
|  7   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  8   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  10   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  11   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  12   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  13   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  14   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  15   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  17   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  18   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_lease_clause">t_sign_lease_clause</a>

**说明：** 电子签-租约信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FKHOUSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 盘客houseId  |
|  4   | FKROOM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘roomId  |
|  5   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  6   | FPROPERTY_ADDRESS |   varchar   | 50 |   0    |    Y     |  N   |       | 房屋地址  |
|  7   | FPROPERTY_NUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 房产证号  |
|  8   | FBUILD_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 建筑面积  |
|  9   | FMONTHLY_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 房屋租金  |
|  10   | FGUARANTEE_DEPOSIT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 押金方式押一，押二等  |
|  11   | FGUARANTEE_DEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 押金  |
|  12   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 租期开始  |
|  13   | FEND_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 租期结束  |
|  14   | FHANDOVER_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 交付时间  |
|  15   | FPLEDGED |   tinyint   | 3 |   0    |    Y     |  N   |       | 房屋是否抵押  |
|  16   | FINVOICE |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否要发票是true否false  |
|  17   | FDELEGATE |   tinyint   | 3 |   0    |    Y     |  N   |       | 装修改建甲方报备true甲方通知乙方报备false  |
|  18   | FPREEMPTIVE |   tinyint   | 3 |   0    |    Y     |  N   |       | 放弃优先购买权是true否false  |
|  19   | FUSAGE |   varchar   | 50 |   0    |    Y     |  N   |       | 用途  |
|  20   | FOTHER_USAGE |   varchar   | 50 |   0    |    Y     |  N   |       | 其他用途说明  |
|  21   | FPERSON_COUNTS |   varchar   | 50 |   0    |    Y     |  N   |       | 居住人数  |
|  22   | FMAX_PERSON_COUNTS |   varchar   | 50 |   0    |    Y     |  N   |       | 最多居住人数  |
|  23   | FPAYMENT_FREQUENCY |   varchar   | 50 |   0    |    Y     |  N   |       | 支付频次  |
|  24   | FPAYMENT_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 支付方式  |
|  25   | FPAYMENT_DATE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款日期  |
|  26   | FCUSTOMER_FEES |   varchar   | 250 |   0    |    Y     |  N   |       | 客户承担费用  |
|  27   | FOWNER_FEES |   varchar   | 250 |   0    |    Y     |  N   |       | 业主承担费用  |
|  28   | FOTHER_FEES |   varchar   | 50 |   0    |    Y     |  N   |       | 其他费用说明  |
|  29   | FMAINTAIN_DAYS |   varchar   | 50 |   0    |    Y     |  N   |       | 维修时限  |
|  30   | FOWNER_ACCOUNT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业主收款账户  |
|  31   | FOWNER_ACCOUNT_BANK |   varchar   | 50 |   0    |    Y     |  N   |       | 业主开户行  |
|  32   | FKOWNER_ACCOUNT_PROVINCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开户行所在地省份  |
|  33   | FOWNER_ACCOUNT_PROVINCE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开户行所在地省份  |
|  34   | FKOWNER_ACCOUNT_CITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开户行所在地城市  |
|  35   | FOWNER_ACCOUNT_CITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开户行所在地城市  |
|  36   | FOWNER_ACCOUNT_BRANCH |   varchar   | 50 |   0    |    Y     |  N   |       | 业主开户支行  |
|  37   | FOWNER_ACCOUNT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 业主收款账号  |
|  38   | FHANDOVER_DELAY_DAYS |   varchar   | 50 |   0    |    Y     |  N   |       | 迟延交付上限天数  |
|  39   | FPAYMENT_DELAY_DAYS |   varchar   | 50 |   0    |    Y     |  N   |       | 租金拖欠上限天数  |
|  40   | FOVERDUE_AMOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 欠缴费上限金额  |
|  41   | FOWNER_DEFAULT_RATE |   varchar   | 50 |   0    |    Y     |  N   |       | 业主违约金费率  |
|  42   | FCUSTOMER_DEFAULT_RATE |   varchar   | 50 |   0    |    Y     |  N   |       | 客户违约金费率  |
|  43   | FOWNER_AHEAD_RATE |   varchar   | 50 |   0    |    Y     |  N   |       | 业主提前收回房屋违约金费率  |
|  44   | FCUSTOMER_AHEAD_RATE |   varchar   | 50 |   0    |    Y     |  N   |       | 租客提前退租违约金费率  |
|  45   | FOTHER_DEFAULT_CLAUSE |   varchar   | 50 |   0    |    Y     |  N   |       | 其他违约金费率  |
|  46   | FOTHER_DEFAULT_REMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 其他违约条款  |
|  47   | FREMARK |   varchar   | 520 |   0    |    Y     |  N   |       | 合同备注  |
|  48   | FOWNER_COM_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业主姓名  |
|  49   | FOWNER_COM_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 业主联系电话  |
|  50   | FOWNER_COM_EMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 业主电子邮箱  |
|  51   | FOWNER_COM_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 业主送达地址  |
|  52   | FCUSTOMER_COM_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户姓名  |
|  53   | FCUSTOMER_COM_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 客户联系电话  |
|  54   | FCUSTOMER_COM_EMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 客户电子邮箱  |
|  55   | FCUSTOMER_COM_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 客户送达地址  |
|  56   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  57   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  58   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  59   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  60   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  61   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  62   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  63   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  64   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  65   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  66   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  67   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_margin_custodian">t_sign_margin_custodian</a>

**说明：** 定金托管协议

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次ID  |
|  3   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  4   | FTOTAL_MARGIN |   decimal   | 20 |   2    |    Y     |  N   |       | 定金金额  |
|  5   | FCUSTODIAL_MARGIN |   decimal   | 20 |   2    |    Y     |  N   |       | 托管金额  |
|  6   | FCONDITION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 放款条件  |
|  7   | FOWNER_BANK_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 甲方开户行  |
|  8   | FOWNER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 甲方户名  |
|  9   | FOWNER_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 甲方账号  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  11   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  12   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  13   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  14   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  15   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  16   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  18   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  19   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  20   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_operation_record">t_sign_operation_record</a>

**说明：** 操作记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 关联表单  |
|  3   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人  |
|  4   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人  |
|  5   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FCONTENT |   varchar   | 50 |   0    |    Y     |  N   |       | 内容  |
|  8   | FDATE |   datetime   | 19 |   0    |    Y     |  N   |       | 操作时间  |
|  9   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  10   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_org_config">t_sign_org_config</a>

**说明：** 签约组织配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  4   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  5   | FORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 组织  |
|  6   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  7   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  8   | FTRANSACTION_TYPES |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型  |
|  9   | FSTORE_SIGN |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否允许店签  |
|  10   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  11   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  12   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  13   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  14   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  15   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  16   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  17   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  18   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_owner">t_sign_owner</a>

**说明：** 合同签署业主

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FKBROKER_OWNER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 盘客ownerId  |
|  4   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  5   | FCERTIFICATE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号码  |
|  6   | FCERTIFICATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型  |
|  7   | FCELLPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号  |
|  8   | FEMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 邮箱  |
|  9   | FNATIONALITY |   varchar   | 50 |   0    |    Y     |  N   |       | 国籍  |
|  10   | FCERTIFICATE_VALIDITY_BEGIN |   date   | 10 |   0    |    Y     |  N   |       | 证件有效期开始  |
|  11   | FCERTIFICATE_VALIDITY_END |   date   | 10 |   0    |    Y     |  N   |       | 证件有效期结束  |
|  12   | FCERTIFICATE_IMAGE_A |   varchar   | 200 |   0    |    Y     |  N   |       | 证件照片1  |
|  13   | FCERTIFICATE_IMAGE_B |   varchar   | 200 |   0    |    Y     |  N   |       | 证件照片2  |
|  14   | FCOMMUNICATE_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 联系地址  |
|  15   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 联系人类型  |
|  16   | FENTERPRISE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 企业类型  |
|  17   | FENTERPRISE_PERSON |   varchar   | 50 |   0    |    Y     |  N   |       | 企业签署人身份  |
|  18   | FINDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 排序  |
|  19   | FAGENT_INDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人索引  |
|  20   | FKAGENT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人ID  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  22   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  23   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  25   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  28   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  30   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  31   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_paper_cancel_agreement">t_sign_paper_cancel_agreement</a>

**说明：** 纸质撤单协议

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告id  |
|  4   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  5   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  6   | FOWNER_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 业主交易服务费  |
|  7   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  8   | FCUSTOMER_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 客户交易服务费  |
|  9   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 合同状态  |
|  10   | FDESC |   varchar   | 300 |   0    |    Y     |  N   |       | 撤单描述纸质  |
|  11   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  13   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  14   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  15   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  16   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  18   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  20   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  21   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_party">t_sign_party</a>

**说明：** 合同签署方

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKCONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同  |
|  3   | FKPLAT_USER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署平台用户ID  |
|  4   | FCERTIFICATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型  |
|  5   | FCERTIFICATE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号  |
|  6   | FCELLPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号  |
|  7   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  8   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署状态  |
|  9   | FPARTY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方  |
|  10   | FPARTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方展示名  |
|  11   | FIS_AGENT |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否代理人  |
|  12   | FINDEX |   decimal   | 2 |   0    |    Y     |  N   |       | 索引  |
|  13   | FSIGN_URL |   varchar   | 1000 |   0    |    Y     |  N   |       | 签署链接  |
|  14   | FKEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署关键字  |
|  15   | FSIGN_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 签署时间  |
|  16   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  18   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  19   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  20   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  21   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  22   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  23   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  24   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  25   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  26   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  27   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_reservation">t_sign_reservation</a>

**说明：** 签约预约

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 预约号  |
|  3   | FRESERVATION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 预约日期  |
|  4   | FKPERIOD_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 时段  |
|  5   | FKSIGN_SITE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约点  |
|  6   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 意向  |
|  7   | FREPORT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  8   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  9   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 预约状态  |
|  10   | FKSIGN_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约员（受理人）  |
|  11   | FSIGN_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 签约员（受理人）  |
|  12   | FKSIGN_PERSON_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约员（受理人）组织  |
|  13   | FSIGN_PERSON_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 签约员（受理人）组织  |
|  14   | FSIGN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 受理日期  |
|  15   | FKCUSTOMER_BROKER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 客户所有人  |
|  16   | FCUSTOMER_BROKER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户所有人  |
|  17   | FKCUSTOMER_BROKER_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 客户所有人组织  |
|  18   | FCUSTOMER_BROKER_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户所有人组织  |
|  19   | FKMORTGAGE_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭员  |
|  20   | FMORTGAGE_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭员  |
|  21   | FKMORTGAGOR_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭组织  |
|  22   | FKCANCEL_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 中止、取消操作人  |
|  23   | FCANCEL_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 中止、取消操作人  |
|  24   | FKCANCEL_PERSON_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 中止、取消操作人组织  |
|  25   | FCANCEL_PERSON_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 中止、取消操作人组织  |
|  26   | FCANCEL_REASON |   varchar   | 200 |   0    |    Y     |  N   |       | 中止、取消原因  |
|  27   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  28   | FSIGN_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 签约类型  |
|  29   | FSTORE_SIGN_ADDRESS |   varchar   | 200 |   0    |    Y     |  N   |       |   |
|  30   | FKCREATOR_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人（预约人）组织  |
|  31   | FCREATOR_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人（预约人）组织  |
|  32   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  33   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  34   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  35   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  36   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  37   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  38   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  39   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  43   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_reservation_customer">t_sign_reservation_customer</a>

**说明：** 预约客户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKRESERVATION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 预约  |
|  3   | FKCUSTOMER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 客户Id  |
|  4   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户姓名  |
|  5   | FAGENT |   varchar   | 50 |   0    |    Y     |  N   |       | 有无代理人AgentEnum  |
|  6   | FAGENT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人姓名  |
|  7   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_reservation_owner">t_sign_reservation_owner</a>

**说明：** 预约业主

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKRESERVATION_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业主姓名  |
|  4   | FPROPERTY_RIGHT |   varchar   | 50 |   0    |    Y     |  N   |       | 产权人PropertyRightEnum  |
|  5   | FPROPERTY_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 物业状态PropertyStatusEnum  |
|  6   | FHAS_RENT |   varchar   | 50 |   0    |    Y     |  N   |       | 有无租客RentEnum  |
|  7   | FHAS_AGENT |   varchar   | 50 |   0    |    Y     |  N   |       | 有无代理人AgentEnum  |
|  8   | FAGENT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 代理人姓名  |
|  9   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  10   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_sale_clause">t_sign_sale_clause</a>

**说明：** 买卖合同信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署批次  |
|  3   | FKHOUSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 盘客houseId  |
|  4   | FKROOM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘roomId  |
|  5   | FPROPERTY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名  |
|  6   | FPROPERTY_ADDRESS |   varchar   | 50 |   0    |    Y     |  N   |       | 物业地址（盘客）  |
|  7   | FBUILD_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 1-1建筑面积  |
|  8   | FCERTIFICATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 1-1房屋地址房产证地址  |
|  9   | FPROPERTY_NUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 1-2房产证号  |
|  10   | FCONDOMINIUM_CERTIFICATE |   varchar   | 100 |   0    |    Y     |  N   |       | 1-2共有权证号  |
|  11   | FLAND_RIGHT_CERTIFICATE |   varchar   | 100 |   0    |    Y     |  N   |       | 1-2土地使用权证号  |
|  12   | FPLANNING_USE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-1规划用途（□住宅/□公寓/□办公/□商业/□车位/□其他）residential,apartment,office,commercial,parking,others  |
|  13   | FPLANNING_USE_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-1规划用途其他  |
|  14   | FPROPERTY_NATURE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-2房产性质（□商品房/□房改房/□向社会公开销售的经济适用房/□拆迁安置房/□其他）commercial_house,reform_housing,affordable_house,resettlement_house,others  |
|  15   | FPROPERTY_NATURE_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-2房产性质其他  |
|  16   | FPROPERTY_ACQUISITION_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-3房产取得方式（□自购/□赠与/□继承/□其他）self_purchase,gift,inheritance,other  |
|  17   | FPROPERTY_ACQUISITION_METHOD_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-3房产取得方式其他  |
|  18   | FLAND_ACQUISITION_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 1-3-4土地取得方式（□划拨/□出让）allocation,transfer  |
|  19   | FHOUSING_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 1-4有无房屋户口□有/□无户口YESNO  |
|  20   | FMORTGAGE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5产权有无抵押YESNO  |
|  21   | FMORTGAGEE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5抵押权人  |
|  22   | FMORTGAGE_CANCELLATION_MODE |   decimal   | 20 |   2    |    Y     |  N   |       | 1-5注销抵押方式（1.自行赎楼2.第三方赎楼）12  |
|  23   | FPREPARATION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5-1甲方自行赎楼：备齐资料时间类型  |
|  24   | FPREPARATION_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 1-5-1甲方自行赎楼：备齐资料天数（本合同签署之日起XX日内、乙方取得贷款承诺函之日起XX日）  |
|  25   | FDEPOSIT_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 1-5-1甲方自行赎楼：款项存入天数（于收到抵押权人还款通知之日起XX日）  |
|  26   | FCANCEL_MORTGAGE_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 1-5-1注销抵押登记天数（并于实际还款后XX日内办理注销抵押登记事宜）  |
|  27   | FCANCEL_MORTGAGE_PERIOD |   datetime   | 19 |   0    |    Y     |  N   |       | 1-5-1注销抵押登记期限（最终注销抵押登记完成的时间不得晚于）  |
|  28   | FFORECLOSURE_COSTS |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5-2-1赎楼费用承担方（□甲方承担/□乙方承担/□其他）owner,customer,others  |
|  29   | FFORECLOSURE_COSTS_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5-2-1赎楼费用承担方其他  |
|  30   | FFORECLOSURE_DAYS_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5-2-2开始赎楼天数类型（本合同签署之日、取得贷款承诺函之日）sign_day,loan_commitment_day  |
|  31   | FFORECLOSURE_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 1-5-2-2开始赎楼天数（本合同签署之日起XX日内、乙方取得贷款承诺函之日起XX日内）  |
|  32   | FTHIRD_CANCEL_MORTGAGE_DAYS |   datetime   | 19 |   0    |    Y     |  N   |       | 1-5-2-3第三方赎楼注销抵押登记期限（最终注销抵押登记完成的时间不得晚于）  |
|  33   | FADDITIONAL_FORECLOSURE_COSTS |   varchar   | 50 |   0    |    Y     |  N   |       | 1-5-3额外赎楼费用承担方（甲乙双方一致同意由此多出的费用由）  |
|  34   | FLEASE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 1-6有无租约YESNO  |
|  35   | FLEASE_TERM |   varchar   | 50 |   0    |    Y     |  N   |       | 1-6租约是否有期限YESNO  |
|  36   | FLEASE_END_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 1-6租约结束日期（租赁期限至年月日止）  |
|  37   | FLEASE_HANDLED |   decimal   | 20 |   2    |    Y     |  N   |       | 1-6租约处理方式（双方同意按以下第X种方式处理租赁事宜）  |
|  38   | FLEASE_TERMINATION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-6-1租约解除期限类型（1、甲方须于□房屋交付前/□年月日前解除原租赁合同）before_delivery,fix_day  |
|  39   | FLEASE_TERMINATION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 1-6-1租约解除期限时间（XX日前解除原租赁合同）  |
|  40   | FLEASE_DEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 1-6-2租赁押金  |
|  41   | FRENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 1-6-2租金金额  |
|  42   | FRENT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 1-6-2租金类型□月/□季/□年monthly,quarterly,annually  |
|  43   | FLEASE_OTHER_TERMS |   varchar   | 300 |   0    |    Y     |  N   |       | 1-6-3租约处理其他条款  |
|  44   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 2成交总价  |
|  45   | FDEPOSIT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-1定金金额  |
|  46   | FDEPOSIT_DOWN_PAYMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-1定金首期金额  |
|  47   | FDEPOSIT_FINAL_PAYMENT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 3-1定金尾款日期  |
|  48   | FFINAL_DEPOSIT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-1定金尾款金额  |
|  49   | FDOWN_PAYMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-2首期款金额  |
|  50   | FDOWN_PAYMENT_TIME_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 3-2首期款支付时间类型（应于□年月日/□该房屋过户当天/□其它）fix_day,delivery_day,others  |
|  51   | FDOWN_PAYMENT_TIME_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 3-2首期款支付时间类型其他  |
|  52   | FDOWN_PAYMENT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 3-2首期款支付日期（乙方应于□年月日）  |
|  53   | FDOWN_PAYMENT_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 3-2首期款付款方式（支付至□双方约定的银行第三方监管账户/□甲方银行账户/□其他）custodial_account,owner,others  |
|  54   | FDOWN_PAYMENT_METHOD_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-2首期款付款其他  |
|  55   | FDELIVERY_DEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-3交房保证金  |
|  56   | FFINAL_PAYMENT_METHOD |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4尾款支付方式（1、一次性付款;2、按揭贷款）12  |
|  57   | FFINAL_PAYMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4尾款金额  |
|  58   | FONE_TIME_PAYMENT_PERIOD |   datetime   | 19 |   0    |    Y     |  N   |       | 3-4-1一次性付款期限  |
|  59   | FONE_TIME_PAYMENT_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-1一次性付款方式（支付至□双方约定的银行第三方监管账户/□甲方银行账户/□其他）custodial_account,owner,others  |
|  60   | FONE_TIME_PAYMENT_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-1一次性付款方式其他  |
|  61   | FMORTGAGE_METHOD |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2按揭方式（□商业贷款/□公积金贷款/□商业和公积金组合）mortgage,accumulation_fund,composite_mortgage  |
|  62   | FMORTGAGE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2按揭金额  |
|  63   | FMORTGAGE_TERM_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2按揭期限天数（与按揭期限其他二选一）  |
|  64   | FMORTGAGE_TERM_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2按揭期限其他（与按揭期限天数二选一）  |
|  65   | FBUSINESS_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 商业贷款金额  |
|  66   | FBUSINESS_TERM_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 商业贷款（乙方应于口本合同签署后x日内/口其他:）contract_sign,others  |
|  67   | FBUSINESS_TERM_TYPE_DAY |   varchar   | 50 |   0    |    Y     |  N   |       | 商业贷款：本合同签署后x日内  |
|  68   | FBUSINESS_TERM_TYPE_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 商业贷款：其他描述  |
|  69   | FACCUMULATION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 公积金贷款金额  |
|  70   | FACCUMULATION_DAY |   varchar   | 50 |   0    |    Y     |  N   |       | 公积金贷:乙方应于拿到不动产证后x日内前往贷款机构办理贷款申请手绥  |
|  71   | FACCUMULATION_CREDIT_DAY |   varchar   | 50 |   0    |    Y     |  N   |       | 公积金贷:乙方需于公积金放款至乙方账户后x个工作日内转至甲方指定账户  |
|  72   | FDEPOSIT_PAYMENT_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 定金（支付至□双方约定的银行第三方监管账户/□甲方银行账户/□中介方托管账户/□其他）custodial_account,owner,intermediary,others  |
|  73   | FDEPOSIT_PAYMENT_INTO_ACCOUNT_DESC |   varchar   | 50 |   0    |    Y     |  N   |       | 定金/□其他描述  |
|  74   | FOTHER_PROCESSING |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2不批准按揭其他处理方式(自行筹齐、继续申请贷款、本合同终止如数返还，本合同终止定金不予退回)self_financing,continued_application,refund,not_refund  |
|  75   | FSELF_FINANCING_TERM_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2乙方自筹期限类型（□贷款机构通知之日起日内/□向房产权属登记部门递件申请过户之日前/□向税务机关缴税之日前/□其他）notice,apply,tax,others  |
|  76   | FSELF_FINANCING_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2乙方自筹天数（贷款机构通知之日起XX日内）  |
|  77   | FSELF_FINANCING_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2乙方自筹其他  |
|  78   | FSELF_FINANCING_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2乙方自筹支付方式（将剩余款项划转支付至□双方约定的银行第三方监管账户/□甲方银行账户/□其他）custodial_account,owner,others  |
|  79   | FSELF_FINANCING_PAYMENT_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2乙方自筹支付其他  |
|  80   | FCONTINUES_TO_LEND_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2乙方继续贷款天数（乙方须于贷款机构通知之日起XX日）  |
|  81   | FLENDING_INSTITUTIONS_NUMBER |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2乙方继续贷款机构数（不超过XX家贷款机构）  |
|  82   | FNON_APPROVED_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-2不批天数（如乙方在首家贷款机构不批贷或不足额批贷后XX日）  |
|  83   | FNON_APPROVED_SELF_FINANCING_DAYS |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2不批自筹天数（乙方应在前述期间届满后XX日内自行筹齐）  |
|  84   | FNON_APPROVED_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2不批自筹支付方式（□双方约定的银行第三方监管账户/□甲方银行账户/□其他）custodial_account,owner,others  |
|  85   | FNON_APPROVED_PAYMENT_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 3-4-2不批自筹支付其他  |
|  86   | FLATE_DEFAULT_LIABILITY |   decimal   | 20 |   2    |    Y     |  N   |       | 3-4-3逾期违约责任（甲方有权要求乙方按下列第XX种）12  |
|  87   | FCONTRACT_SIGN_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 4-1合同签署天数（共同达成之日起XX个工作日内办理网签或共同签署）  |
|  88   | FMORTGAGE_REGISTRATION_DAYS |   decimal   | 20 |   2    |    Y     |  N   |       | 4-3抵押登记办理天数（取得新的产权证书后XX日内申请办理抵押登记手续）  |
|  89   | FTAXES_AND_FEES_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 5-1税费其他  |
|  90   | FOWNER_UNDERTAKES |   varchar   | 150 |   0    |    Y     |  N   |       | 5-1甲方承担项目  |
|  91   | FCUSTOMER_UNDERTAKES |   varchar   | 150 |   0    |    Y     |  N   |       | 5-1乙方承担项目  |
|  92   | FTAX_ADJUSTMENT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 5-2税费调整类型（调整部分双方协商同意□由房产所在地所适用的法律法规或政策规定的缴纳义务方承担/□其他）obligated_party,others  |
|  93   | FTAX_ADJUSTMENT_OTHER |   varchar   | 50 |   0    |    Y     |  N   |       | 5-2税费调整其他  |
|  94   | FDELIVERY_DAYS |   varchar   | 50 |   0    |    Y     |  N   |       | 6-1-0房屋交付时间x天  |
|  95   | FKEY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 6-1-1钥匙类型（□房门钥匙/□门禁卡/□开门密码）key,access_card,passcode  |
|  96   | FHOUSEHOLD_OUT_PERIOD |   decimal   | 20 |   2    |    Y     |  N   |       | 6-2户口迁出期限（XX日内将户口迁出）  |
|  97   | FHOUSEHOLD_OUT_DEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 6-2户口迁出保证金  |
|  98   | FHOUSEHOLD_OUT_DEPOSIT_TERM_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 6-2户口迁出保证金期限类型（甲方应在收到□第一笔定金/□第一笔首付款之日）deposit,down_payment  |
|  99   | FHOUSEHOLD_DEPOSIT_INTO_ACCOUNT |   varchar   | 50 |   0    |    Y     |  N   |       | 6-2户口签署保证金支付方式（£双方约定的银行第三方监管账户/□双方指定的第三方账户/□乙方指定账户）custodial_account,owner,others  |
|  100   | FHAUNTED_HOUSE |   varchar   | 50 |   0    |    Y     |  N   |       | 7-2是否凶宅（在房产本体结构内□是/□否发生过非正常死亡事件）YESNO  |
|  101   | FWATER_LEAKAGE |   varchar   | 50 |   0    |    Y     |  N   |       | 7-3是否漏水YESNO  |
|  102   | FTERMITES |   varchar   | 50 |   0    |    Y     |  N   |       | 7-4是否有白蚁YESNO  |
|  103   | FOTHER_TERMS |   varchar   | 500 |   0    |    Y     |  N   |       | 12其他条款  |
|  104   | FOWNER_COM_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业主姓名  |
|  105   | FOWNER_COM_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 业主联系电话  |
|  106   | FOWNER_COM_EMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 业主电子邮箱  |
|  107   | FOWNER_COM_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 业主送达地址  |
|  108   | FCUSTOMER_COM_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户姓名  |
|  109   | FCUSTOMER_COM_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 客户联系电话  |
|  110   | FCUSTOMER_COM_EMAIL |   varchar   | 50 |   0    |    Y     |  N   |       | 客户电子邮箱  |
|  111   | FCUSTOMER_COM_ADDRESS |   varchar   | 300 |   0    |    Y     |  N   |       | 客户送达地址  |
|  112   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  113   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  114   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  115   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  116   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  117   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  118   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  119   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  120   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  121   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  122   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  123   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_site_config">t_sign_site_config</a>

**说明：** 签约点配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 200 |   0    |    Y     |  N   |       | 签约点名称  |
|  4   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 地理城市  |
|  5   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 地理城市  |
|  6   | FKSIGN_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约部门  |
|  7   | FSIGN_ORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 签约部门  |
|  8   | FADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  9   | FWEEKS |   varchar   | 100 |   0    |    Y     |  N   |       | 星期WeekEnum  |
|  10   | FLINKMAN |   varchar   | 50 |   0    |    Y     |  N   |       | 联系人  |
|  11   | FTELEPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 电话  |
|  12   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  13   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  16   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  17   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  18   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  19   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  20   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_site_period_config">t_sign_site_period_config</a>

**说明：** 时间段

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FBEGIN |   varchar   | 50 |   0    |    Y     |  N   |       | 开始时间  |
|  3   | FEND |   varchar   | 50 |   0    |    Y     |  N   |       | 结束时间  |
|  4   | FMAX |   decimal   | 20 |   2    |    Y     |  N   |       | 最大可接待人数  |
|  5   | FKCONFIG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约点配置  |
|  6   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 有效  |
|  7   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_template">t_sign_template</a>

**说明：** 合同模板

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   bigint   | 19 |   0    |    N     |  Y   |       | id  |
|  2   | FKPLATFORM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签署平台ID  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 模板名称  |
|  4   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  5   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  6   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  7   | FNUMBER_PREFIX |   varchar   | 50 |   0    |    Y     |  N   |       | 编号前缀  |
|  8   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 模板类型  |
|  9   | FTEMPLATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 模板类型  |
|  10   | FPREVIEW_URL |   varchar   | 200 |   0    |    Y     |  N   |       | 预览链接  |
|  11   | FPARTY_A_KEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方一关键字  |
|  12   | FPARTY_A_AGENT_KEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方一代理人关键字  |
|  13   | FPARTY_B_KEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方二关键字  |
|  14   | FPARTY_B_AGENT_KEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方二代理人关键字  |
|  15   | FPARTY_C_KEYWORDS |   varchar   | 50 |   0    |    Y     |  N   |       | 签署方三关键字  |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  17   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  18   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_sign_transaction">t_sign_transaction</a>

**说明：** 合同签署批次

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  3   | FTRANSACTION_NUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 签署批次编号  |
|  4   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  5   | FKHOUSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | houseId  |
|  6   | FKROOM_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘字典roomID  |
|  7   | FROOM_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 房间编号  |
|  8   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交人  |
|  9   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 成交人  |
|  10   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交人组织  |
|  11   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 成交人组织  |
|  12   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人  |
|  13   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人  |
|  14   | FKAPPLY_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人组织  |
|  15   | FAPPLY_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 发起人组织  |
|  16   | FKRESERVATION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约预约  |
|  17   | FPROPERTY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 物业名  |
|  18   | FCERTIFICATE_NAME |   varchar   | 500 |   0    |    Y     |  N   |       | 房产证具体地址  |
|  19   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告ID  |
|  20   | FDISPLAY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 展示名  |
|  21   | FKMAIN_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 主合同  |
|  22   | FMAIN_CONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 主合同  |
|  23   | FKMAIN_SOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 主合同单据  |
|  24   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 公司主体  |
|  25   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司id  |
|  26   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司  |
|  27   | FSUBMITTED |   varchar   | 10 |   0    |    Y     |  N   |       | 是否已提交  |
|  28   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  29   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  30   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  31   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  32   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  33   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  34   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  35   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  36   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  37   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  38   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  39   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  40   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
|  41   | FVERSION |   varchar   | 50 |   0    |    Y     |  N   |       | 乐观锁版本  |
**表名：** <a id="t_sign_user">t_sign_user</a>

**说明：** 签约用户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名/名称  |
|  3   | FCELLPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号  |
|  4   | FCERTIFICATE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 证件类型  |
|  5   | FCERTIFICATE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 证件号码  |
|  6   | FKPLAT_USER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约平台用户  |
|  7   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  8   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  9   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  10   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_allocation">t_trade_allocation</a>

**说明：** 新房分佣

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价  |
|  3   | FTOTAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 营收总佣  |
|  4   | FRATIO |   decimal   | 20 |   4    |    Y     |  N   |       | 佣金点数  |
|  5   | FFIX_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 定佣  |
|  6   | FCOMMISSION_TOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金总金额  |
|  7   | FCOMMISSION_SITE_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金案场部分  |
|  8   | FCOMMISSION_DISTRIBUTOR_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金分销部分  |
|  9   | FCOMMISSION_SITE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金案场金额  |
|  10   | FCOMMISSION_DISTRIBUTOR_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金分销金额  |
|  11   | FCOOPERATION_TOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金总金额  |
|  12   | FCOOPERATION_SITE_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金案场部分  |
|  13   | FCOOPERATION_DISTRIBUTOR_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金分销部分  |
|  14   | FCOOPERATION_SITE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金案场金额  |
|  15   | FCOOPERATION_DISTRIBUTOR_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金分销金额  |
|  16   | FAWARD_TOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖总金额  |
|  17   | FAWARD_SITE_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖案场部分  |
|  18   | FAWARD_DISTRIBUTOR_PART |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖分销部分  |
|  19   | FAWARD_SITE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖案场金额  |
|  20   | FAWARD_DISTRIBUTOR_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖分销金额  |
|  21   | FAWARD_INCLUDED |   varchar   | 50 |   0    |    Y     |  N   |       | 是否总佣内现金奖  |
|  22   | FMODE |   varchar   | 50 |   0    |    Y     |  N   |       | ModeEnum：分配模式(按比例-RATIO/按金额-AMOUNT)  |
|  23   | FCOOPERATION_MODE |   varchar   | 50 |   0    |    Y     |  N   |       | 合作佣金分配模式  |
|  24   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_assign_related">t_trade_assign_related</a>

**说明：** 成交分配相关人员

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FKCOMMISSION_ASSIGN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分配  |
|  4   | FASSIGN_KEY |   varchar   | 64 |   0    |    Y     |  N   |       | 分配key  |
|  5   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员ID  |
|  6   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  7   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织ID  |
|  8   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  9   | FORG_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 组织类型  |
|  10   | FROLE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 角色类型  |
|  11   | FASSIGN_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 分配比例  |
|  12   | FADJUST_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 调整比例  |
|  13   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 金额  |
|  14   | FLEVEL |   int   | 10 |   0    |    Y     |  N   |       |   |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  16   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  17   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  18   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  19   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  20   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  21   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  22   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司名  |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  24   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  25   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  26   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_attachment">t_trade_attachment</a>

**说明：** 通用附件存储

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 关联单据ID  |
|  3   | FDESC |   varchar   | 100 |   0    |    Y     |  N   |       | 文件描述（文件名）  |
|  4   | FURL |   varchar   | 100 |   0    |    Y     |  N   |       | url  |
|  5   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  6   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  8   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  9   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  10   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_auditrecord">t_trade_auditrecord</a>

**说明：** 审核记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKBILL_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据  |
|  3   | FOPINION |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  4   | FTYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 类型  |
|  5   | FDATE |   datetime   | 19 |   0    |    Y     |  N   |       | 时间  |
|  6   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  7   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  8   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  9   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  10   | FREASON |   varchar   | 300 |   0    |    Y     |  N   |       | 驳回原因  |
|  11   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  12   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  13   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  15   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  16   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_commission_adjust">t_trade_commission_adjust</a>

**说明：** 佣金调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKAPPLY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请单编号  |
|  3   | FKTRANSACTION_REPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易ID  |
|  4   | FADJUST_DATE |   date   | 10 |   0    |    Y     |  N   |       | 调整日期，取审核通过日期  |
|  5   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金合计  |
|  6   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  7   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  8   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  9   | FCOMMISSION_PAY |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金支付费用  |
|  10   | FCOLLABORATE_COST |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金扣除  |
|  11   | FSURPLUS_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 可分配业绩  |
|  12   | FAFTER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后佣金合计  |
|  13   | FAFTER_CUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后客户佣金  |
|  14   | FAFTER_OWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后业主佣金  |
|  15   | FAFTER_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后交易服务费  |
|  16   | FAFTER_COMMISSION_PAY |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后佣金支付费用  |
|  17   | FAFTER_COLLABORATE_COST |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后合作佣金扣除  |
|  18   | FAFTER_SURPLUS_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 调整后可分配业绩  |
|  19   | FBALANCE |   decimal   | 20 |   2    |    Y     |  N   |       | 差额，调整后-调整前  |
|  20   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  21   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  22   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  23   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  24   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  25   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  26   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  28   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司ID  |
|  29   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  30   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  31   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_commission_assign">t_trade_commission_assign</a>

**说明：** 业绩分配

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FREPORT_ID |   varchar   | 44 |   0    |    N     |  N   |       | 成交单id  |
|  3   | FKEY |   varchar   | 64 |   0    |    Y     |  N   |       | 标识符  |
|  4   | FBROKER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 经纪人id  |
|  5   | FBROKER_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 经纪人名  |
|  6   | FMANAGER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 店长ID  |
|  7   | FMANAGER_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 店长名称  |
|  8   | FORG_ID |   varchar   | 44 |   0    |    N     |  N   |       | 经纪人组织id  |
|  9   | FORG_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 经纪人组织名  |
|  10   | FSTORE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 经纪人分店id  |
|  11   | FSTORE_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 经纪人分店id名  |
|  12   | FCOMPANYINFO_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 业绩所属公司ID  |
|  13   | FCOMPANYINFO_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 业绩所属公司名称  |
|  14   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类别（平台房管费，客户所有人，客户合作人，拓房人，维护人）  |
|  15   | FASSIGN_TYPE_ALIAS |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类型描述  |
|  16   | FASSIGN_RATIO |   decimal   | 5 |   2    |    Y     |  N   |       | 分配比例  |
|  17   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分配金额  |
|  18   | FORIGINAL_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 原始分配金额  |
|  19   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  20   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  21   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  22   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  23   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  24   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  25   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  26   | FBRAND_ORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 品牌名称  |
|  27   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  28   | FLOCK_RATIO |   varchar   | 10 |   0    |    Y     |  N   |       | 比例是否不可修改  |
|  29   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | cuid  |
|  30   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | cuname  |
|  31   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司ID  |
|  32   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司名  |
|  33   | FORIGINAL_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 盘方原始比例  |
|  34   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_commission_scheme">t_trade_commission_scheme</a>

**说明：** 上数佣金标准方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 方案名称  |
|  3   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 所属城市  |
|  4   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 所属城市  |
|  5   | FSTART_DATE |   date   | 10 |   0    |    Y     |  N   |       | 启用日期  |
|  6   | FEND_DATE |   date   | 10 |   0    |    Y     |  N   |       | 禁用日期  |
|  7   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 来源  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_commission_scheme_radio">t_trade_commission_scheme_radio</a>

**说明：** 上数佣金标准方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 所属方案  |
|  3   | FSTART |   decimal   | 20 |   2    |    Y     |  N   |       | 开始区间  |
|  4   | FEND |   decimal   | 20 |   2    |    Y     |  N   |       | 结束区间  |
|  5   | FRENT_MIN_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 租最小比例  |
|  6   | FRENT_MAX_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 租最大比例  |
|  7   | FSALE_MIN_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 售最小比例  |
|  8   | FSALE_MAX_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 售最大比例  |
|  9   | FCOMMISSION_MIN_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 代理售（代办）最小  |
|  10   | FCOMMISSION_MAX_RADIO |   decimal   | 20 |   2    |    Y     |  N   |       | 代理售（代办）最大  |
|  11   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  13   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  14   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  15   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  16   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_contract_configure">t_trade_contract_configure</a>

**说明：** 合同资料配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FCITY |   varchar   | 150 |   0    |    Y     |  N   |       | 城市  |
|  4   | FNAME |   varchar   | 150 |   0    |    Y     |  N   |       | 合同资料名称  |
|  5   | FBIG_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 所属大类  |
|  6   | FAPPLY_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型(多个用字符串拼接)  |
|  7   | FMUST_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 必要资料(多个用字符串拼接)  |
|  8   | FELECTRONIC_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否电子合同资料  |
|  9   | FELECTRONIC_CATEGORY |   varchar   | 50 |   0    |    Y     |  N   |       | 电子合同类别  |
|  10   | FSTATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 状态ENABLED(启用),DISABLED(禁用)  |
|  11   | FOPEN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 开启日期  |
|  12   | FCLOSE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 关闭日期  |
|  13   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  14   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  16   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  17   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  18   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  19   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  20   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  21   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  22   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  23   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_contract_configure_copy">t_trade_contract_configure_copy</a>

**说明：** 合同资料配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FENTITY_ID |   varchar   | 100 |   0    |    Y     |  N   |       | 关联主键id  |
|  3   | FCITY |   varchar   | 150 |   0    |    Y     |  N   |       | 城市  |
|  4   | FNAME |   varchar   | 150 |   0    |    Y     |  N   |       | 合同资料名称  |
|  5   | FBIG_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 所属大类  |
|  6   | FAPPLY_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 成交类型(多个用字符串拼接)  |
|  7   | FMUST_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 必要资料(多个用字符串拼接)  |
|  8   | FSTATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 状态ENABLED(启用),DISABLED(禁用)  |
|  9   | FOPEN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 开启日期  |
|  10   | FCLOSE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 关闭日期  |
|  11   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  12   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  15   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  16   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  17   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  18   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  19   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  20   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_contract_data">t_trade_contract_data</a>

**说明：** 合同资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FDATA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 资料名称  |
|  4   | FDATA_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 资料类型（合同、合同附件）  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态（待启用、启用、禁用）  |
|  6   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  7   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  8   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  9   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  10   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  11   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  12   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_customer">t_trade_customer</a>

**说明：** 客户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FSOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 来源  |
|  3   | FREPORT_ID |   varchar   | 44 |   0    |    N     |  N   |       | 成交单id  |
|  4   | FTYPE |   varchar   | 44 |   0    |    N     |  N   |       | 类型  |
|  5   | FCUSTOMER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 盘客客户id  |
|  6   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名(盘客)  |
|  7   | FMOBILE_TEL |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号码(盘客)  |
|  8   | FCERTIFICATE_NUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 身份证件号码(盘客)  |
|  9   | FRELATION |   varchar   | 50 |   0    |    Y     |  N   |       | 关系（本人、丈夫、妻子、亲属、儿女）  |
|  10   | FAREA |   varchar   | 50 |   0    |    Y     |  N   |       | 地区（中国大陆、中国香港、中国澳门、中国台湾、海外）  |
|  11   | FADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  12   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  13   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  16   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  17   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  18   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  19   | FRATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 新房：产权比例  |
|  20   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  21   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_expand">t_trade_expand</a>

**说明：** 新房项目

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSOURCEID |   varchar   | 50 |   0    |    Y     |  N   |       | 新房拓展ID  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FKGARDENID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘  |
|  5   | FKPRINCIPALID |   varchar   | 50 |   0    |    Y     |  N   |       | 负责人  |
|  6   | FKPRINCIPALPERSONID |   varchar   | 50 |   0    |    Y     |  N   |       | 负责人姓名  |
|  7   | FSBWL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 商办项目类型  |
|  8   | FKCOMPANYID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FCREATETIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FUPDATETIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  11   | FKCREATEOPERATORID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FKUPDATEOPERATORID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  13   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       | cuid  |
|  14   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司  |
|  15   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_expandcontract">t_trade_expandcontract</a>

**说明：** 拓展合同

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  3   | FSUBJECT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 结算主体类型  |
|  4   | FREMITTANCE |   varchar   | 50 |   0    |    Y     |  N   |       | 结算方式  |
|  5   | FKSETTLE_SUBJECT_ID |   varchar   | 500 |   0    |    Y     |  N   |       | 结算主体开发商、代理商ID  |
|  6   | FSETTLE_SUBJECT_NAME |   varchar   | 500 |   0    |    Y     |  N   |       | 结算主体开发商、代理商名字  |
|  7   | FOPPOSITE_PARTY |   varchar   | 50 |   0    |    Y     |  N   |       | 对方单位  |
|  8   | FKPROJECT_MANAGER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目负责人  |
|  9   | FPROJECT_MANAGER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 项目负责人  |
|  10   | FPROJECT_MANAGER_ORG |   varchar   | 50 |   0    |    Y     |  N   |       | 项目负责人  |
|  11   | FKPROJECT_MANAGER_ORGID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目负责人  |
|  12   | FPROJECT_MANAGER_CU |   varchar   | 50 |   0    |    Y     |  N   |       | 项目负责人  |
|  13   | FEFFECT_PERIOD_FROM |   datetime   | 19 |   0    |    Y     |  N   |       | 合同有效期-起始时间  |
|  14   | FEFFECT_PERIOD_TO |   datetime   | 19 |   0    |    Y     |  N   |       | 合同有效期-截止时间  |
|  15   | FSIGN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 签署日期  |
|  16   | FCOMMISSION_COMMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 佣金备注  |
|  17   | FPHONE_FORMAT_HK |   varchar   | 50 |   0    |    Y     |  N   |       | 香港报备手机输入方式  |
|  18   | FPHONE_FORMAT |   varchar   | 50 |   0    |    Y     |  N   |       | 内地报备手机输入方式  |
|  19   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展id  |
|  20   | FAVAILABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 线上数据状态用于查询控制操作的逻辑  |
|  21   | FCONTRACT_NUMBER_NO |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  22   | FSUBJECT |   varchar   | 50 |   0    |    Y     |  N   |       | 我方单位  |
|  23   | FSUBJECT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 我方单位名称  |
|  24   | FFLOAT_COMMISSION |   varchar   | 50 |   0    |    Y     |  N   |       | 佣金跳点说明  |
|  25   | FSBWL_EXPAND_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 商办项目类型  |
|  26   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_garden">t_trade_garden</a>

**说明：** 楼盘

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | GARDEN_PROPERTIES |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘属性  |
|  3   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  4   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名称  |
|  5   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编码  |
|  6   | FREGISTER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 备案名  |
|  7   | FDETAIL_ADDRESS |   varchar   | 500 |   0    |    Y     |  N   |       | 详细地址(地址)  |
|  8   | FKDEVELOPER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开发商id  |
|  9   | FDEVELOPER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开发商名称  |
|  10   | FPROPERTY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 物业类型  |
|  11   | FCITY |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  12   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_house">t_trade_house</a>

**说明：** 房间

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FSOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 来源  |
|  3   | FHOUSE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 盘客房源id（手动录入没值）  |
|  4   | FBED_ROOM |   decimal   | 2 |   0    |    Y     |  N   |       | 房  |
|  5   | FLIVING_ROOM |   decimal   | 2 |   0    |    Y     |  N   |       | 厅  |
|  6   | FITCHEN_ROOM |   decimal   | 2 |   0    |    Y     |  N   |       | 厨  |
|  7   | FBATH_ROOM |   decimal   | 2 |   0    |    Y     |  N   |       | 卫  |
|  8   | FROOM_CODE |   varchar   | 200 |   0    |    Y     |  N   |       | 房号  |
|  9   | FPROPORTION |   decimal   | 20 |   2    |    Y     |  N   |       | 面积  |
|  10   | FCERTIFICATENO |   varchar   | 100 |   0    |    Y     |  N   |       | 房产证编号  |
|  11   | FONLINE_SIGNATURENO |   varchar   | 100 |   0    |    Y     |  N   |       | 网签编号  |
|  12   | FARREARS_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 按揭欠款  |
|  13   | FARREARS_BANK |   varchar   | 200 |   0    |    Y     |  N   |       | 按揭银行  |
|  14   | FPROPERTY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 物业类型  |
|  15   | FACTUAL_USE |   varchar   | 50 |   0    |    Y     |  N   |       | 商办物业类型  |
|  16   | FGARDEN_ID |   varchar   | 100 |   0    |    Y     |  N   |       | 房间所属楼盘id  |
|  17   | FGARDEN_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 楼盘名称  |
|  18   | FBUILDING_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 楼栋id  |
|  19   | FBUILDING_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 楼栋  |
|  20   | FUNIT_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 单元id  |
|  21   | FUNIT_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 单元  |
|  22   | FFLOOR_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 楼层id  |
|  23   | FFLOOR_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 楼层  |
|  24   | FADDRESS |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 地址  |
|  25   | FDETAIL_ADDRESS |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 详细地址  |
|  26   | FREGIONAL_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 区域名称  |
|  27   | FPROPERTY_STATUS |   varchar   | 30 |   0    |    Y     |  N   |       | 产权情况  |
|  28   | FDIRECTION |   varchar   | 30 |   0    |    Y     |  N   |       | 朝向  |
|  29   | FROOM_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 套内面积  |
|  30   | FROOM_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 房间ID  |
|  31   | FROOM_NUMBER |   varchar   | 20 |   0    |    Y     |  N   |       | 房号编码  |
|  32   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  33   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  34   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  35   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  36   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  37   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  38   | FSTATUS |   varchar   | 10 |   0    |    Y     |  N   |   ENABLED    | 是否有效  |
|  39   | FCERTIFICATE_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 房产证名称  |
|  40   | FHOUSE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 房源状态（来源盘客）  |
|  41   | FHOUSE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 房源状态  |
|  42   | FREGIONAL_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 区域ID  |
|  43   | FCITY |   varchar   | 20 |   0    |    Y     |  N   |       | 城市  |
|  44   | FKREGION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 区域  |
|  45   | FDECORATION |   varchar   | 50 |   0    |    Y     |  N   |       | 装修状况  |
|  46   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  47   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  48   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  49   | FKWEBSITE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 网点ID  |
|  50   | FWEBSITE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 网点名称  |
|  51   | FROOM_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 商办房源类型  |
|  52   | FPROPERTY_RIGHT_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 商办产权类型  |
|  53   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_node_settle_config">t_trade_node_settle_config</a>

**说明：** 节点结算配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展Id  |
|  4   | FPAYMENT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方式  |
|  5   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘ID  |
|  6   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 项目名称  |
|  7   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  8   | FKEXPAND_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同Id  |
|  9   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  10   | FKSCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易节点方案  |
|  11   | FSCHEME_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易节点方案名称  |
|  12   | FKSCHEME_NODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算节点Id  |
|  13   | FSCHEME_NODE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 结算节点名称  |
|  14   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  15   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  19   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  20   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  21   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  22   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  23   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  24   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_owner">t_trade_owner</a>

**说明：** 业主

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FREPORT_ID |   varchar   | 44 |   0    |    N     |  N   |       | 成交单id  |
|  3   | FTYPE |   varchar   | 44 |   0    |    N     |  N   |       | 类型  |
|  4   | FBROKER_OWNER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 盘客业主id（盘客）  |
|  5   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名（盘客）  |
|  6   | FPROPERTY_RATIO |   decimal   | 5 |   2    |    Y     |  N   |       | 占比（盘客）  |
|  7   | FMOBILE_TEL |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号码（盘客）  |
|  8   | FCERTIFICATE_NUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 身份证件号码（盘客）  |
|  9   | FRELATION |   varchar   | 50 |   0    |    Y     |  N   |       | 关系（本人、丈夫、妻子、亲属、儿女）  |
|  10   | FAREA |   varchar   | 50 |   0    |    Y     |  N   |       | 地区（中国大陆、中国香港、中国澳门、中国台湾、海外）  |
|  11   | FADDRESS |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  12   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  13   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  16   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  17   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  18   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  19   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  20   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_performance_adjust">t_trade_performance_adjust</a>

**说明：** 业绩调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  2   | FKCOMMISSION_ASSIGN_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 业绩分配  |
|  3   | FKREPORT_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 交易报告ID  |
|  4   | FASSIGN_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 分配类别AssignTypeEnum  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态AdjustStatusEnum  |
|  6   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人  |
|  7   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人姓名  |
|  8   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  9   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织名  |
|  10   | FASSIGN_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 分配比例  |
|  11   | FADJUST_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 调整比例  |
|  12   | FAMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 分配金额  |
|  13   | FADJUST_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 调整金额  |
|  14   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 调整原因  |
|  15   | FKAUDIT_RECORD_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 审核记录  |
|  16   | FKAPPLY_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 申请组织  |
|  17   | FAPPLY_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请组织名称  |
|  18   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  19   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  20   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  21   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  22   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  23   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  24   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_performance_complain">t_trade_performance_complain</a>

**说明：** 业绩申诉

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单  |
|  3   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 申诉原因  |
|  4   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  5   | FKOPERATION_AUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 运营审核人  |
|  6   | FOPERATION_AUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 运营审核人  |
|  7   | FKOPERATION_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 运营审核记录  |
|  8   | FKBIZ_AUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人  |
|  9   | FBIZ_AUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人  |
|  10   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核记录  |
|  11   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申诉人组织  |
|  12   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申诉人组织  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  17   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  18   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  19   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_person_of_day">t_trade_person_of_day</a>

**说明：** 当日人员信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 64 |   0    |    N     |  Y   |       | id  |
|  2   | FKPERSON_ID |   varchar   | 50 |   0    |    N     |  N   |       | 人员ID  |
|  3   | FNAME |   varchar   | 50 |   0    |    N     |  N   |       | 姓名  |
|  4   | FDATE |   date   | 10 |   0    |    N     |  N   |       | 日期  |
|  5   | FKORG_ID |   varchar   | 50 |   0    |    N     |  N   |       | 组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    N     |  N   |       | 组织名称  |
|  7   | FKPOSITION_TYPE_ID |   varchar   | 50 |   0    |    N     |  N   |       | 岗位ID  |
|  8   | FKLEVEL_ID |   varchar   | 50 |   0    |    N     |  N   |       | 职级  |
|  9   | FLEVEL_NAME |   varchar   | 50 |   0    |    N     |  N   |       | 职级  |
|  10   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  11   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  12   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  13   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  14   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  15   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  16   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  17   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否有效  |
|  18   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  19   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  20   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_projectperson">t_trade_projectperson</a>

**说明：** 项目相关人员

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  N   |       |   |
|  2   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | personId  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 名字  |
|  4   | FPHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 电话  |
|  5   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展ID  |
|  6   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  8   | FKPOSITION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位  |
|  9   | FPOSITION_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位  |
|  10   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘ID  |
|  11   | FKPRINCIPAL_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目总监personId  |
|  12   | FKFOLLOWER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目跟进人personId  |
|  13   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  16   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  17   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  18   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  19   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  20   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  21   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_projectperson_history">t_trade_projectperson_history</a>

**说明：** 项目人员分配记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 新房项目ID  |
|  3   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘ID  |
|  4   | FKPROJECT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  5   | FPROJECT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  6   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | OApersonId  |
|  7   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织ID  |
|  8   | FKPRINCIPAL_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目总监personId  |
|  9   | FKFOLLOWER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目跟进人personId  |
|  10   | FMANAGER |   tinyint   | 3 |   0    |    Y     |  N   |       |   |
|  11   | FBEGIN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 开始时间  |
|  12   | FEND_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 结束时间  |
|  13   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_property_config">t_trade_property_config</a>

**说明：** 业务佣金标准配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 100 |   0    |    Y     |  N   |       | 方案名称  |
|  4   | FORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 适用组织id  |
|  5   | FORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 适用组织名  |
|  6   | FOPEN_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 启用时间  |
|  7   | FCLOSE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 关闭时间  |
|  8   | FSTATUS |   varchar   | 44 |   0    |    Y     |  N   |       | 使用状态  |
|  9   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  10   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  11   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  12   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  13   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  14   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  15   | FCITY_CODE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  16   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_property_config_interval">t_trade_property_config_interval</a>

**说明：** 业务佣金标准配置-成交总价区间

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | PROPERTY_CONFIG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 业务佣金方案的id  |
|  3   | FSTART |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价开始  |
|  4   | FEND |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价结束  |
|  5   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  6   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  7   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  8   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  9   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  10   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  11   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_property_config_ratio">t_trade_property_config_ratio</a>

**说明：** 业务佣金标准配置-成交总价区间

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FPROPERTY_CONFIG_INTERVAL_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 业务佣金方案区间的id  |
|  3   | FPROPERTY_TYPE |   varchar   | 100 |   0    |    Y     |  N   |       | 物业用途  |
|  4   | FRENT |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 租  |
|  5   | FSALE |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 售  |
|  6   | FGANGED_RENT |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 代理租  |
|  7   | FGANGED_RENT_GANGED |   decimal   | 8 |   2    |    Y     |  N   |       | 代理租(联动)  |
|  8   | FGANGED_SALE_NEW |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 代理售(新房)  |
|  9   | FGANGED_SALE_COMMISSION |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 代理售(代办)  |
|  10   | FGANGED_SALE_GANGED |   decimal   | 8 |   2    |    Y     |  N   |   0.00    | 代理售(联动)  |
|  11   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  12   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  15   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  16   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_recognizechips">t_trade_recognizechips</a>

**说明：** 新房认筹

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名  |
|  5   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  6   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  7   | FRECOGNIZE_DATE |   date   | 10 |   0    |    Y     |  N   |       | 认筹日期  |
|  8   | FALL_COLLECTED |   tinyint   | 3 |   0    |    Y     |  N   |       | 是否已收齐  |
|  9   | FREFUND_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 退款状态  |
|  10   | FCUSTOMER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 客户姓名  |
|  11   | FRESERVE_PHONE |   varchar   | 50 |   0    |    Y     |  N   |       | 报备手机号  |
|  12   | FSOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 客户来源  |
|  13   | FTOTAL_RECEIVED |   decimal   | 20 |   2    |    Y     |  N   |       | 已收认筹款  |
|  14   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展ID  |
|  15   | FKRESERVATION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 报备  |
|  16   | FRESERVATION_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKCONTRACT_ID |   varchar   | 300 |   0    |    Y     |  N   |       | 拓展/项目合同  |
|  18   | FKGARDEN_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘  |
|  19   | FKCONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交确认人  |
|  20   | FCONFIRM_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 成交确认人  |
|  21   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分公司  |
|  22   | FCOMPANY_ENTITY |   varchar   | 50 |   0    |    Y     |  N   |       | 新房公司主体  |
|  23   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  26   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  27   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  28   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  29   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  30   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  31   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  32   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  33   | FRECOGNIZE_INCOME_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹收款状态  |
|  34   | FCLICK_ALL_COLLECTED |   bit   | 1 |   0    |    Y     |  N   |       | 是否点击已收齐  |
|  35   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_report_data">t_trade_report_data</a>

**说明：** 交易报告相关数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价  |
|  3   | FUNIT_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交单价  |
|  4   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  5   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  6   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金合计  |
|  7   | FDEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 客户保证金  |
|  8   | FCOMMISSION_PAY |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金支付费用  |
|  9   | FTAXES_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 税费  |
|  10   | FVALUATION_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 评估费  |
|  11   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  12   | FCOLLABORATE_FLAG |   tinyint   | 3 |   0    |    Y     |  N   |       | 合作费用是否扣除  |
|  13   | FCOLLABORATE_COST |   decimal   | 20 |   2    |    Y     |  N   |       | 合作费扣除  |
|  14   | FCOLLABORATE_REMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 合作费扣除备注  |
|  15   | FSURPLUS_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 可分配业绩（佣金）  |
|  16   | FINCOME_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 收佣金额（佣金）  |
|  17   | FINCOME_PENALTY |   decimal   | 20 |   2    |    Y     |  N   |       | 已收违约金  |
|  18   | FSETTLE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额（佣金）  |
|  19   | FIN_SETTLE_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算中的佣金  |
|  20   | FDEDUCTION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 抵扣金额（佣金）  |
|  21   | FINCOME_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 已收交易服务费  |
|  22   | FSETTLED_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 已结算交易服务费  |
|  23   | FIN_SETTLE_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 结算中的交易服务费  |
|  24   | FPAYING_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 付款中佣金  |
|  25   | FPAYING_SERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 付款中交易服务费  |
|  26   | FPAYING_PENALTY |   decimal   | 20 |   2    |    Y     |  N   |       | 付款中违约金  |
|  27   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  29   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  30   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_required_config">t_trade_required_config</a>

**说明：** 必要件配置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FEXPAND_CU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 分公司名称  |
|  4   | FEXPAND_CUID |   varchar   | 44 |   0    |    Y     |  N   |       | 分公司ID  |
|  5   | FGARDEN_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 楼盘编号  |
|  6   | FREGISTER_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名称  |
|  7   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理AGENT(默认)、未代理NOAGENT）  |
|  8   | FCONTRACT_NUMBER |   varchar   | 44 |   0    |    Y     |  N   |       | 合同编号  |
|  9   | FREQUIRED_SCHEME_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 必要件方案ID  |
|  10   | FSCHEME_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 必要件方案  |
|  11   | FMUST_DATA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 必要资料  |
|  12   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态（待启用、启用、禁用）  |
|  13   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  14   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  16   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  17   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  18   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  19   | FGARDEN_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 楼盘ID  |
|  20   | FEXPAND_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 拓展ID  |
|  21   | FEXTEND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展名称推广名称  |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_required_scheme">t_trade_required_scheme</a>

**说明：** 必要件方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FSCHEME_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 方案名  |
|  4   | F_MUST_DATA_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 必要资料(多个用字符串拼接)  |
|  5   | F_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态（待启用、启用、禁用）  |
|  6   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  7   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  8   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  9   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  10   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  11   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  12   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_reservation">t_trade_reservation</a>

**说明：** 报备

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | fid |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | fnumber |   varchar   | 50 |   0    |    Y     |  N   |       | 报备编号  |
|  4   | fappointmentTime |   datetime   | 19 |   0    |    Y     |  N   |       | 预计到访时间  |
|  5   | fcustomerName |   varchar   | 50 |   0    |    Y     |  N   |       | 客户姓名  |
|  6   | fcustomerGender |   varchar   | 50 |   0    |    Y     |  N   |       | 性别  |
|  7   | freservePhone |   varchar   | 50 |   0    |    Y     |  N   |       | 报备手机号  |
|  8   | fkgardenId |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘ID  |
|  9   | fkexpandId |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展ID  |
|  10   | fkbrokerPersonId |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人的id  |
|  11   | fbrokerPersonName |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人名称  |
|  12   | fkbrokerCompanyId |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人所在公司id  |
|  13   | fbrokerCompanyName |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人所在公司名称  |
|  14   | fbrokerPersonCell |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人手机号  |
|  15   | fbrokerType |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人类型  |
|  16   | fkbrokerBrandId |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人加盟品牌id  |
|  17   | fkexpandContractId |   varchar   | 300 |   0    |    Y     |  N   |       | 拓展合同ID  |
|  18   | fexpandCuid |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘所属公司id  |
|  19   | fexpandCuName |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘城市公司名  |
|  20   | fexpandName |   varchar   | 50 |   0    |    Y     |  N   |       | 拓展楼盘名  |
|  21   | fregisterName |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘登记名  |
|  22   | fkmanagerId |   varchar   | 50 |   0    |    Y     |  N   |       | 人员分配-项目经理id  |
|  23   | fkprojectDirectId |   varchar   | 50 |   0    |    Y     |  N   |       | 人员分配-项目总监id  |
|  24   | fkbrokerOrgId |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人部门id  |
|  25   | fbrokerOrgName |   varchar   | 50 |   0    |    Y     |  N   |       | 经纪人所在部门名称  |
|  26   | fkcompanyId |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | fcreateTime |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  28   | fupdateTime |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  29   | fkcreateOperatorId |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  30   | fkupdateOperatorId |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  31   | fbrokerCompanyType |   varchar   | 50 |   0    |    Y     |  N   |       | 报备经纪人公司类型  |
|  32   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_scheme_data_middle">t_trade_scheme_data_middle</a>

**说明：** 必要件方案-合同资料中间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FREQUIRED_SCHEME_ID |   varchar   | 44 |   0    |    N     |  N   |       | 必要件方案id  |
|  3   | FMUST_DATA_ID |   varchar   | 44 |   0    |    N     |  N   |       | 必要资料id  |
|  4   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  5   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  6   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  7   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  8   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  9   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  10   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribe">t_trade_subscribe</a>

**说明：** 新房成交

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  4   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 成交状态  |
|  6   | FSETTLE_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 结算状态  |
|  7   | FCOMMISSION_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 收佣情况  |
|  8   | FGARDEN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 楼盘名称  |
|  9   | FGARDEN_TYPE |   varchar   | 10 |   0    |    Y     |  N   |   AGENT    | 楼盘类型（已代理(默认)、未代理）  |
|  10   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  11   | FKRESERVATION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 报备ID  |
|  12   | FKRECOGNIZE_CHIPS_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹  |
|  13   | FKEXPAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKEXPAND_CONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 项目合同  |
|  15   | FBUY_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 认购日期  |
|  16   | FKTRADE_HOUSE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 房源  |
|  17   | FLIVING_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 厅  |
|  18   | FBED_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 房  |
|  19   | FKITCHEN |   varchar   | 50 |   0    |    Y     |  N   |       | 厨  |
|  20   | FWASHROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 卫  |
|  21   | FBUILD_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 建筑面积  |
|  22   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价  |
|  23   | FPAYMENT_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款方式  |
|  24   | FKCONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FCONFIRM_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FCUSTOMER_NAMES |   varchar   | 300 |   0    |    Y     |  N   |       |   |
|  27   | FSTAFF_NAMES |   varchar   | 300 |   0    |    Y     |  N   |       |   |
|  28   | FREMARK |   varchar   | 250 |   0    |    Y     |  N   |       | 备注  |
|  29   | FBIZ_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 业务类型  |
|  30   | FKREC_COMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 电商分佣  |
|  31   | FKCOMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销分佣  |
|  32   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市项目部  |
|  33   | FKSIGN_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约主体：取此城市项目部对应的公司主体（OA）  |
|  34   | FSIGN_COMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 签约主体：取此城市项目部对应的公司主体（OA）  |
|  35   | FKSETTLE_COMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算主体：取楼盘对应的开发商或代理商的公司主体  |
|  36   | FSETTLE_COMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 结算主体：取楼盘对应的开发商或代理商的公司主体  |
|  37   | FSOURCE |   varchar   | 20 |   0    |    Y     |  N   |       | 客户来源  |
|  38   | FPERFORMANCE_MONTH |   datetime   | 19 |   0    |    Y     |  N   |       | 业绩月  |
|  39   | FTOTAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 营收总佣  |
|  40   | FACTUAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 实收总佣  |
|  41   | FSETTLED_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 结算佣金  |
|  42   | FKNODE_SCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 节点方案  |
|  43   | FKCURRENT_SCHEME_NODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 当前方案节点ID  |
|  44   | FCURRENT_NODE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 当前节点名称  |
|  45   | FSETTLE_NODE_PROCEED |   varchar   | 50 |   0    |    Y     |  N   |       | 结算节点已办结  |
|  46   | FKNODE_SETTLE_CONFIG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 结算节点配置  |
|  47   | FREPORT_NUMBERS |   varchar   | 100 |   0    |    Y     |  N   |       | 三级成交报告编号  |
|  48   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  49   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  50   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核  |
|  51   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核  |
|  52   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  53   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  54   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  55   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  56   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  57   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  58   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  59   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  60   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  61   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribeassign">t_trade_subscribeassign</a>

**说明：** 新房分配

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  3   | FKPERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  4   | FPERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  5   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  6   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司  |
|  8   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  9   | FCOMMISSION_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金比例  |
|  10   | FCOMMISSION_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金金额  |
|  11   | FCOOPERATION_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金比例  |
|  12   | FCOOPERATION_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金金额  |
|  13   | FAWARD_RATIO |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖比例  |
|  14   | FAWARD_VALUE |   decimal   | 20 |   2    |    Y     |  N   |       | 现金奖金额  |
|  15   | FTOTAL |   decimal   | 20 |   2    |    Y     |  N   |       | 总额  |
|  16   | FMASTER |   bit   | 1 |   0    |    Y     |  N   |       | 是否主单人(1:是0:否)  |
|  17   | FCHANNEL_FOLLOWER |   varchar   | 50 |   0    |    Y     |  N   |       | 渠道跟进人  |
|  18   | FCHANNEL_MANAGER |   varchar   | 50 |   0    |    Y     |  N   |       | 渠道经理名称  |
|  19   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体ID  |
|  21   | FBUSINESS_ENTITY_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 经营主体名称  |
|  22   | FKBUSINESS_ENTITY_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体组织ID  |
|  23   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  24   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  25   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  26   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  27   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FCOMPANY_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 城市公司（CU）类型  |
|  29   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  30   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribecancel">t_trade_subscribecancel</a>

**说明：** 新房撤单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据  |
|  3   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  4   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       |   |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 撤单状态  |
|  6   | FKCREATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  7   | FCREATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  8   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  9   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  10   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  11   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  12   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  13   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名  |
|  14   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  16   | FKFIN_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核  |
|  17   | FKBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核  |
|  18   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  19   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  20   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  21   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  23   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  24   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  25   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  26   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribecontract">t_trade_subscribecontract</a>

**说明：** 新房合同资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交ID  |
|  3   | FKCONTRACT_DATA_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同资料  |
|  4   | FCONTRACT_DATA_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 合同资料名称  |
|  5   | FFILE_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 类型：FileTypeEnum合同、合同附件  |
|  6   | FDATA_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 联次  |
|  7   | FKCREATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  8   | FCREATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 人员  |
|  9   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  10   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  11   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 编号  |
|  12   | FREQUIRED_DATA |   bit   | 1 |   0    |    Y     |  N   |       | 是否必要件  |
|  13   | FUPDATE_TIMES |   int   | 10 |   0    |    Y     |  N   |       | 更新次数  |
|  14   | FKUPDATE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 合同资料更新ID  |
|  15   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 显示名  |
|  16   | FREMARK |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  17   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  19   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  20   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  21   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  22   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  23   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  24   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  25   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribecontract_update">t_trade_subscribecontract_update</a>

**说明：** 新房合同资料更新

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 单据  |
|  3   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  4   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 更新原因  |
|  5   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 更新状态  |
|  6   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  7   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 组织  |
|  8   | FSTART_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 申请时间  |
|  9   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  10   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  11   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 公司名  |
|  12   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  14   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  16   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  17   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  21   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  22   | FKAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核ID  |
|  23   | FNEWEST |   varchar   | 50 |   0    |    Y     |  N   |       | 是否最新更新申请  |
|  24   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribe_commission_adjust">t_trade_subscribe_commission_adjust</a>

**说明：** 新房成交报告佣金调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交报告id  |
|  3   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  4   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  5   | FKRECOGNIZE_CHIPS_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹id  |
|  6   | FRECOGNIZE_CHIPS_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 认筹编号  |
|  7   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价  |
|  8   | FBEFORE_ADJUST_TOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 调整前成交总价  |
|  9   | FTOTAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 营收总佣  |
|  10   | FBEFORE_ADJUST_TOTAL_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 调整前营收总佣  |
|  11   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 调整原因  |
|  12   | FKAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核id  |
|  13   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人id  |
|  14   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人姓名  |
|  15   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织  |
|  16   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织名称  |
|  17   | FAPPLY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 申请时间  |
|  18   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 审核状态  |
|  19   | FKCOMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 分销分佣  |
|  20   | FKREC_COMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 电商分佣  |
|  21   | FKBEFORE_ADJUST_COMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前分销分佣  |
|  22   | FKBEFORE_ADJUST_REC_COMMISSION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前电商分佣  |
|  23   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  24   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  25   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  26   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  27   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  28   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  29   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  30   | FCU_NAME |   varchar   | 10 |   0    |    Y     |  N   |       |   |
|  31   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  32   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  33   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  34   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribe_contract_adjust">t_trade_subscribe_contract_adjust</a>

**说明：** 新房成交报告合同调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交报告id  |
|  3   | FSUBSCRIBE_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 交易编号  |
|  4   | FTENEMENT |   varchar   | 50 |   0    |    Y     |  N   |       | 物业名称  |
|  5   | FBEFORE_ADJUST_LIVING_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前厅  |
|  6   | FBEFORE_ADJUST_BED_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前房  |
|  7   | FBEFORE_ADJUST_KITCHEN |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前厨  |
|  8   | FBEFORE_ADJUST_WASHROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 调整前卫  |
|  9   | FLIVING_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 厅  |
|  10   | FBED_ROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 房  |
|  11   | FKITCHEN |   varchar   | 50 |   0    |    Y     |  N   |       | 厨  |
|  12   | FWASHROOM |   varchar   | 50 |   0    |    Y     |  N   |       | 卫  |
|  13   | FBEFORE_ADJUST_BUILD_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 调整前建筑面积  |
|  14   | FBUILD_AREA |   decimal   | 20 |   2    |    Y     |  N   |       | 建筑面积  |
|  15   | FBEFORE_ADJUST_REMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 调整前备注  |
|  16   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  17   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 调整原因  |
|  18   | FKAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核id  |
|  19   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人id  |
|  20   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人姓名  |
|  21   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织  |
|  22   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织名称  |
|  23   | FAPPLY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 申请时间  |
|  24   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 审核状态  |
|  25   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  26   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  27   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  28   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  29   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  30   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  31   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  32   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  33   | FCU_NAME |   varchar   | 10 |   0    |    Y     |  N   |       |   |
|  34   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  35   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  36   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  37   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_subscribe_node">t_trade_subscribe_node</a>

**说明：** 节点跟进

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSUBSCRIBE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交Id  |
|  3   | FKSCHEME_NODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案节点Id  |
|  4   | FKTRANSACTION_NODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易节点ID  |
|  5   | FSETTLEMENT_NODE |   varchar   | 50 |   0    |    Y     |  N   |       | 是否结算节点  |
|  6   | FNOTIFY |   varchar   | 50 |   0    |    Y     |  N   |       | 是否消息通知  |
|  7   | FNODE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 节点名称  |
|  8   | FINDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 序号  |
|  9   | FCONFIRM_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 确认时间  |
|  10   | FKCONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 确认人  |
|  11   | FCONFIRM_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 确认人  |
|  12   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  13   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  14   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  15   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  16   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  17   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  18   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_apply">t_trade_transaction_apply</a>

**说明：** 申请表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FTRANSACTION_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 交易ID  |
|  3   | FAPPLY_TYPE |   varchar   | 44 |   0    |    Y     |  N   |       | 申请类型  |
|  4   | FEXAMINE_STATUS |   varchar   | 40 |   0    |    Y     |  N   |       | 审核状态  |
|  5   | FREASON |   varchar   | 1000 |   0    |    Y     |  N   |       | 原因  |
|  6   | FUPDATE_REASON |   varchar   | 1000 |   0    |    Y     |  N   |       | 更新原因（交易报告修改，合同资料修改，自找过户）  |
|  7   | FBUSINESS_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 业务审核人  |
|  8   | FBUSINESS_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 业务审核人姓名  |
|  9   | FBUSINESS_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 业务审核时间  |
|  10   | FFINANCE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 财务审核人  |
|  11   | FFINANCE_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 财务审核人姓名  |
|  12   | FFINANCE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 财务审核时间  |
|  13   | FOPERATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 运营审核人  |
|  14   | FOPERATE_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 运营审核人姓名  |
|  15   | FOPERATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 运营审核时间  |
|  16   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  17   | FCONTENT |   varchar   | 1000 |   0    |    Y     |  N   |       | 修改内容  |
|  18   | FROLLBACK_REASON |   varchar   | 200 |   0    |    Y     |  N   |       | 驳回原因  |
|  19   | FROLLBACK_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人  |
|  20   | FROLLBACK_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 驳回人姓名  |
|  21   | FROLLBACK_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 驳回时间  |
|  22   | FORG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 组织Id  |
|  23   | FORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 组织名称  |
|  24   | FAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审批id  |
|  25   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  26   | FCREATE_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人名字  |
|  27   | FCREATE_TIME |   timestamp   | 23 |   0    |    N     |  N   |   CURRENT_TIMESTAMP(3)    |   |
|  28   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  29   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  30   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  31   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_apply_commission">t_trade_transaction_apply_commission</a>

**说明：** 申请数据表-申请佣金调整

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | id  |
|  2   | FAPPLY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 申请单编号  |
|  3   | FTRANSACTION_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 交易ID  |
|  4   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金合计  |
|  5   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  6   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  7   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  8   | FCOMMISSION_PAY |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金中支付  |
|  9   | FCOLLABORATE_COST |   decimal   | 20 |   2    |    Y     |  N   |       | 合作佣金扣除  |
|  10   | FSURPLUS_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 可分配业绩  |
|  11   | FTRANSCRIPT |   varchar   | 10 |   0    |    Y     |  N   |       | 副本  |
|  12   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  13   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名字  |
|  14   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  15   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人ID  |
|  16   | FMODIFY_NAME |   varchar   | 44 |   0    |    Y     |  N   |       | 修改人名字  |
|  17   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  18   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_contract">t_trade_transaction_contract</a>

**说明：** 合同资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FAPPLY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 申请单编号  |
|  3   | FREPORT_ID |   varchar   | 44 |   0    |    N     |  N   |       | 成交单id  |
|  4   | FCONTRACT_CONFIG_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 合同配置id  |
|  5   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 资料名称  |
|  6   | FBIG_TYPE |   varchar   | 20 |   0    |    Y     |  N   |       | 所属大类  |
|  7   | FFORMS |   varchar   | 8 |   0    |    Y     |  N   |       | 联次  |
|  8   | FNUMBER |   varchar   | 100 |   0    |    Y     |  N   |       | 编号  |
|  9   | FREMARK |   varchar   | 500 |   0    |    Y     |  N   |       | 备注  |
|  10   | FNECESSITY |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否是必要件  |
|  11   | FUPLOAD |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否附件上传  |
|  12   | FKCONTRACT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 电子合同ID  |
|  13   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  14   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  15   | FORG_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 组织名  |
|  16   | FCREATE_TIME |   timestamp   | 23 |   0    |    N     |  N   |   CURRENT_TIMESTAMP(3)    |   |
|  17   | FSTATUS |   varchar   | 12 |   0    |    Y     |  N   |   ENABLED    | 是否有效  |
|  18   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  19   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  20   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  21   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_node">t_trade_transaction_node</a>

**说明：** 交易节点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 节点名称  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款类型  |
|  5   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  6   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  7   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_node_scheme">t_trade_transaction_node_scheme</a>

**说明：** 交易节点方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 方案名称  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 付款类型  |
|  5   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  6   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  7   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_report">t_trade_transaction_report</a>

**说明：** 交易报告

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 44 |   0    |    N     |  Y   |       | 主键id  |
|  2   | FNUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  3   | FTRANSACTION_SOURCE |   varchar   | 20 |   0    |    Y     |  N   |       | 交易来源  |
|  4   | FSALEMAN_ID |   varchar   | 44 |   0    |    N     |  N   |       | 成交经纪人id  |
|  5   | FSALEMAN_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 成交经纪人  |
|  6   | FSALEMAN_PHONE |   varchar   | 11 |   0    |    Y     |  N   |       | 成交经纪人号码  |
|  7   | FSTORE_MANAGER_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 店长ID  |
|  8   | FSTORE_MANAGER_NAME |   varchar   | 55 |   0    |    Y     |  N   |       | 店长名称  |
|  9   | FORG_ID |   varchar   | 44 |   0    |    N     |  N   |       | 组织（成交经纪人所属组织）id  |
|  10   | FORG_NAME |   varchar   | 200 |   0    |    Y     |  N   |       | 组织（成交经纪人所属组织）  |
|  11   | FTRANSACTION_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 成交类型  |
|  12   | FSOURCE |   varchar   | 100 |   0    |    Y     |  N   |       | 客来源INTENTION:意向SIGN_CENTER:签约中心HOUSE:盘源转成交  |
|  13   | FHOUSE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 盘客房源id  |
|  14   | FROOM_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 盘客房间ID  |
|  15   | FTRADE_HOUSE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 交易楼盘id  |
|  16   | FPROPERTY_NAME |   varchar   | 500 |   0    |    Y     |  N   |       | 物业名称（楼盘+楼栋+房号）冗余字段  |
|  17   | FCERTIFICATE_NAME |   varchar   | 500 |   0    |    Y     |  N   |       | 房产证名称  |
|  18   | FINCOMEINFO_STATUS |   varchar   | 30 |   0    |    Y     |  N   |       | 收佣状态  |
|  19   | FINCOME_INFO_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 实收佣金  |
|  20   | FTRANSFER_STATUS |   varchar   | 30 |   0    |    Y     |  N   |       | 过户状态  |
|  21   | FINTENTION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 意向日期  |
|  22   | FTRANSACTION_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 成交日期  |
|  23   | FTOTAL_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交总价  |
|  24   | FUNIT_PRICE |   decimal   | 20 |   2    |    Y     |  N   |       | 成交单价  |
|  25   | FCUSTOMER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 客户佣金  |
|  26   | FOWNER_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 业主佣金  |
|  27   | FCOMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金合计  |
|  28   | FDEPOSIT |   decimal   | 20 |   2    |    Y     |  N   |       | 客户保证金  |
|  29   | FTRANSACTION_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 成交状态  |
|  30   | FSERVICE_CHARGE |   decimal   | 20 |   2    |    Y     |  N   |       | 交易服务费  |
|  31   | FCOMMISSION_PAY |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金支付费用  |
|  32   | FTAXE_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 税费  |
|  33   | FVALUATION_FEE |   decimal   | 20 |   2    |    Y     |  N   |       | 评估费  |
|  34   | FMORTGAGOR_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 按揭专员id（售）  |
|  35   | FMORTGAGOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭专员（售）  |
|  36   | FKMORTGAGOR_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭员组织Id  |
|  37   | FPAYTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 客户付款方式（售）  |
|  38   | FCOLLABORATE_FLAG |   bit   | 1 |   0    |    Y     |  N   |       | 是否合作扣除  |
|  39   | FCOLLABORATE_COST |   decimal   | 20 |   2    |    Y     |  N   |       | 合作费扣除  |
|  40   | FCOLLABORATE_REMARK |   text   | 65535 |   0    |    Y     |  N   |       | 合作费扣除备注  |
|  41   | FREMARK |   text   | 65535 |   0    |    Y     |  N   |       | 备注  |
|  42   | FSETTLEINFO_STATUS |   varchar   | 30 |   0    |    Y     |  N   |       | 结算情况  |
|  43   | FSURPLUS_COMMISSION |   decimal   | 20 |   2    |    Y     |  N   |       | 可分配业绩  |
|  44   | FCOMMISSION_CONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 业绩确认时间  |
|  45   | FCOMMISSION_CONFIG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 佣金配置id  |
|  46   | FCOMMISSION_POINTS |   decimal   | 20 |   2    |    Y     |  N   |       | 佣金点数  |
|  47   | FROLLBACK_REASON |   text   | 65535 |   0    |    Y     |  N   |       | 驳回原因  |
|  48   | FSETTLEMENT_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 结算金额  |
|  49   | FRATIO_PROTECT_UPPER |   decimal   | 20 |   2    |    Y     |  N   |       | 费率保护上限  |
|  50   | FRATIO_PROTECT_LOWER |   decimal   | 20 |   2    |    Y     |  N   |       | 费率保护下限  |
|  51   | FDEDUCTION_AMOUNT |   decimal   | 20 |   2    |    Y     |  N   |       | 抵扣金额  |
|  52   | FCUSTOMER_NAMES |   varchar   | 300 |   0    |    Y     |  N   |       | 客户名  |
|  53   | FOWNER_NAMES |   varchar   | 300 |   0    |    Y     |  N   |       | 业主名  |
|  54   | FKSUBSCRIBE_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 联动单新房交易ID  |
|  55   | FKSIGN_TRANSACTION_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 签约批次ID  |
|  56   | FCONTRACT_NUMBER |   varchar   | 50 |   0    |    Y     |  N   |       | 合同编号  |
|  57   | FSUBSCRIBE_NUMBER |   varchar   | 20 |   0    |    Y     |  N   |       | 联动单：新房成交编号  |
|  58   | FGANGED_MASTER |   varchar   | 10 |   0    |    Y     |  N   |       | 是否联动单主单人  |
|  59   | FFINANCE_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核人id  |
|  60   | FFINANCE_AUDIT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 财务审核人名  |
|  61   | FLAST_FINANCE_AUDIT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 财务审核时间（需财务审核有值）  |
|  62   | FBIZ_AUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人id  |
|  63   | FBIZ_AUDIT_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 业务审核人名  |
|  64   | FLAST_BIZ_AUDIT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 业务审核时间（需业务审核有值）  |
|  65   | FCREATE_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 创建人ID  |
|  66   | FCREATE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人名称  |
|  67   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  68   | FMODIFY_ID |   varchar   | 44 |   0    |    Y     |  N   |       | 最后更新人ID  |
|  69   | FMODIFY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 最后更新人名称  |
|  70   | FMODIFY_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       |   |
|  71   | FENABLE |   varchar   | 10 |   0    |    Y     |  N   |       | 是否有效  |
|  72   | FBRAND_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  73   | FBRAND_ORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 品牌名称  |
|  74   | FALLIANCE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 加盟公司  |
|  75   | FSTORE_ORG_ID |   varchar   | 64 |   0    |    Y     |  N   |       | 店铺  |
|  76   | FALLIANCE_ORG_NAME |   varchar   | 100 |   0    |    Y     |  N   |       | 加盟公司名称  |
|  77   | FKCOMPANY_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 主体公司  |
|  78   | FCOMPANY_ENTITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 主体公司  |
|  79   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  80   | FKBRAND_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌ID  |
|  81   | FBRAND_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 品牌名  |
|  82   | FCU_NAME |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  83   | FKBUSINESS_ENTITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 经营主体ID  |
|  84   | FKCOMPANY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司ID  |
|  85   | FCOMPANY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 加盟公司名称  |
|  86   | FKREPORT_DATA_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 交易报告相关数据  |
|  87   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  88   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_trade_transaction_scheme_node">t_trade_transaction_scheme_node</a>

**说明：** 交易节点方案明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 节点方案ID  |
|  3   | FKTRANSACTION_NODE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 节点ID  |
|  4   | FNODE_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 节点名称  |
|  5   | FNOTIFY |   varchar   | 50 |   0    |    Y     |  N   |       | 是否消息通知  |
|  6   | FINDEX |   varchar   | 50 |   0    |    Y     |  N   |       | 序号  |
|  7   | FCREATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | FUPDATE_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 最后更新时间  |
|  9   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  10   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  11   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  12   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  13   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  15   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer">t_transfer</a>

**说明：** 过户单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FTRANSFER_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 过户状态  |
|  4   | FKTRANSFER_SCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户方案  |
|  5   | FKTRANSFER_SCHEME_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 方案名称  |
|  6   | FRECEIVE_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 接收日期  |
|  7   | FKMORTGAGOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭员  |
|  8   | FKMORTGAGOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭员姓名  |
|  9   | FKMORTGAGOR_PHONE |   varchar   | 20 |   0    |    Y     |  N   |       | 按揭员电话  |
|  10   | FKORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭组织  |
|  11   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 按揭组织  |
|  12   | FDISPATCH |   varchar   | 50 |   0    |    Y     |  N   |       | [YES本部门,NO其他部门需要分派步骤]  |
|  13   | FKCURRENT_STEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 当前步骤  |
|  14   | FKCURRENT_STEP_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 当前步骤名称  |
|  15   | FSERVICE_FEE_CONFIRMED |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费是否确认  |
|  16   | FKSERVICE_FEE_CONFIRM_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费确认人  |
|  17   | FSERVICE_FEE_CONFIRM_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费确认人  |
|  18   | FKSERVICE_FEE_CONFIRM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费确认组织  |
|  19   | FSERVICE_FEE_CONFIRM_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 交易服务费确认组织  |
|  20   | FSERVICE_FEE_CONFIRM_REMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 交易服务费确认备注  |
|  21   | FSERVICE_FEE_CONFIRM_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 交易服务费确认时间  |
|  22   | FWITHOUT_TRANSFER_REASON |   varchar   | 200 |   0    |    Y     |  N   |       | 无需过户原因  |
|  23   | FKWITHOUT_TRANSFER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 无需过户操作人  |
|  24   | FWITHOUT_TRANSFER_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 无需过户操作人  |
|  25   | FKWITHOUT_TRANSFER_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 无需过户操作人组织  |
|  26   | FWITHOUT_TRANSFER_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 无需过户操作人组织  |
|  27   | KTRANSFER_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 转交时间  |
|  28   | KTRANSFER_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转交人id  |
|  29   | KTRANSFER_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转交人名称  |
|  30   | KTRANSFER_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 转交至部门id  |
|  31   | KTRANSFER_ORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 转交至部门名称  |
|  32   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  33   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  34   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  35   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  36   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  37   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  38   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  39   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  40   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  41   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  42   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_change">t_transfer_change</a>

**说明：** 过户变更

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 交易报告  |
|  3   | FKTRANSFER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户单  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 申请类型  |
|  5   | FKBEFORE_SCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 变更前方案  |
|  6   | FKAFTER_SCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 变更后方案  |
|  7   | FSTATUS |   varchar   | 20 |   0    |    Y     |  N   |       | 状态  |
|  8   | FKAUDIT_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  9   | FAUDIT_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 审核人  |
|  10   | FAUDIT_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 审核时间  |
|  11   | FKAUDIT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 审核记录  |
|  12   | FREASON |   varchar   | 200 |   0    |    Y     |  N   |       | 变更原因  |
|  13   | FKORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 申请人组织  |
|  14   | FORG_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人组织  |
|  15   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  16   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  17   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  18   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  19   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  20   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  21   | FTERMINAL_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 终端类型  |
|  22   | FENABLE |   varchar   | 10 |   0    |    Y     |  N   |       | 是否有效  |
|  23   | FKCU_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 城市公司ID  |
|  24   | FKBRAND_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 品牌组织ID  |
|  25   | FKALLIANCE_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 加盟公司组织ID  |
|  26   | FKPLATFORM_ORG_ID |   varchar   | 10 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_handover">t_transfer_handover</a>

**说明：** 过户物业交割

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKTRANSFER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户单  |
|  3   | FHANDOVER_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 物业交接状态  |
|  4   | FKAPPLY_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  5   | FAPPLY_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 申请人  |
|  6   | FAPPLY_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 申请日期  |
|  7   | FAPPLY_REMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 申请备注  |
|  8   | FKPROCESS_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 开始办理人  |
|  9   | FPROCESS_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 开始办理人  |
|  10   | FPROCESS_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 开始办理日期  |
|  11   | FKFINISH_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 完成人  |
|  12   | FFINISH_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 完成人  |
|  13   | FFINISH_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 完成日期  |
|  14   | FFINISH_OPERATION_TIME |   datetime   | 19 |   0    |    Y     |  N   |       | 完成操作时间  |
|  15   | FFINISH_REMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 完成备注  |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_scheme">t_transfer_scheme</a>

**说明：** 过户方案

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  4   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  5   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 过户方案名称  |
|  6   | FTRANSFER_TYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 过户类型  |
|  7   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 备注  |
|  8   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  9   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  11   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  12   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  13   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  14   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  15   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  16   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  17   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  18   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_scheme_step">t_transfer_scheme_step</a>

**说明：** 过户方案步骤

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKTRANSFER_STEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户节点  |
|  3   | FKTRANSFER_SCHEME_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户方案  |
|  4   | FORDER |   int   | 10 |   0    |    Y     |  N   |       | 排序  |
|  5   | FDAYS |   int   | 10 |   0    |    Y     |  N   |       | 天数  |
|  6   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_scheme_step_required">t_transfer_scheme_step_required</a>

**说明：** 过户方案前置节点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKTRANSFER_SCHEME_STEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 方案节点  |
|  3   | FKREQUIRED_STEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 前置节点  |
|  4   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  5   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  6   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  7   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  8   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  9   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  10   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  11   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  12   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  13   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  14   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_step">t_transfer_step</a>

**说明：** 过户节点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FTRANSACTION_SOURCE |   varchar   | 50 |   0    |    Y     |  N   |       | 数据来源  |
|  3   | FKCITY_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  4   | FCITY_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 城市  |
|  5   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 节点名称  |
|  6   | FAPPLY_OBJECT |   varchar   | 50 |   0    |    Y     |  N   |       | 适用对象  |
|  7   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 描述  |
|  8   | FORDER |   int   | 10 |   0    |    Y     |  N   |       | 步骤排序  |
|  9   | FSTATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 状态  |
|  10   | FADDRESS |   varchar   | 50 |   0    |    Y     |  N   |       | 办理场所  |
|  11   | FBUILD_IN_STEP |   varchar   | 50 |   0    |    Y     |  N   |       | 内置节点  |
|  12   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  13   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  14   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  15   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  16   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  17   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  18   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  19   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  20   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  21   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  22   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_step_datum">t_transfer_step_datum</a>

**说明：** 过户资料

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKSTEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 所属节点  |
|  3   | FKSOURCE_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 来源ID（万通）  |
|  4   | FTYPE |   varchar   | 50 |   0    |    Y     |  N   |       | 资料类别  |
|  5   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 资料名称  |
|  6   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  7   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  8   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  9   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
**表名：** <a id="t_transfer_step_instance">t_transfer_step_instance</a>

**说明：** 过户步骤

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | FID |   varchar   | 50 |   0    |    N     |  Y   |       |   |
|  2   | FKREPORT_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 成交单  |
|  3   | FKTRANSFER_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户单  |
|  4   | FNAME |   varchar   | 50 |   0    |    Y     |  N   |       | 过户步骤名  |
|  5   | FKTRANSFER_STEP_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 过户步骤  |
|  6   | FBUILD_IN_STEP |   varchar   | 50 |   0    |    Y     |  N   |       | 内置节点  |
|  7   | FAPPLY_OBJECT |   varchar   | 50 |   0    |    Y     |  N   |       | 适用对象  |
|  8   | FTRANSFER_STEP_STATUS |   varchar   | 50 |   0    |    Y     |  N   |       | 过户步骤办理状态  |
|  9   | FREMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 步骤备注  |
|  10   | FORDER |   int   | 10 |   0    |    Y     |  N   |       | 第几步  |
|  11   | FDAYS |   int   | 10 |   0    |    Y     |  N   |       | 天数  |
|  12   | FADDRESS |   varchar   | 150 |   0    |    Y     |  N   |       | 办理场所地址  |
|  13   | FSCHEDULE_DATE |   date   | 10 |   0    |    Y     |  N   |       | 计划完成时间  |
|  14   | FKPROCESS_PERSON_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 办理人员  |
|  15   | FPROCESS_PERSON_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 办理人员  |
|  16   | FPROCESS_DATE |   datetime   | 19 |   0    |    Y     |  N   |       | 办理日期  |
|  17   | FPROCESS_REMARK |   varchar   | 200 |   0    |    Y     |  N   |       | 办理备注  |
|  18   | FKTRANSFER_SCHEME_ID |   varchar   | 20 |   0    |    Y     |  N   |       | 过户方案  |
|  19   | FCREATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 创建时间  |
|  20   | FUPDATE_TIME |   timestamp   | 23 |   0    |    Y     |  N   |       | 最后更新时间  |
|  21   | FKCREATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员  |
|  22   | FCREATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 创建人员姓名  |
|  23   | FKUPDATE_OPERATOR_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员  |
|  24   | FUPDATE_OPERATOR_NAME |   varchar   | 50 |   0    |    Y     |  N   |       | 更新人员姓名  |
|  25   | FENABLE |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  26   | FKCU_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  27   | FKBRAND_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  28   | FKALLIANCE_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  29   | FKPLATFORM_ORG_ID |   varchar   | 50 |   0    |    Y     |  N   |       | 平台组织ID  |
