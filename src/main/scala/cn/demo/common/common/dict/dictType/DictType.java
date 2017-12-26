package cn.demo.common.common.dict.dictType;

/**
 * Created by wx on 2017/8/30.
 */
public enum DictType {

    LOAN_FLOW_STATE(0),//贷款流程阶段
    GENDER(1),  //性别
    USER_TYPE(2),//账户类型
    INFO_TYPE(3),//资讯类型
    CONTENT_STATE(4),//政策/资讯状态
    CONTENT_IMPORTANCE(5),//政策/资讯重要级别
    MSG_CHANNNEL(6),//消息输出渠道
    MSG_HANDLE_PRIORITY(7),//消息处理优先级
    MSG_SOURCE_TYPE(8),//消息来源类型
    ORT_TYPE(9),//机构类型
    MARITAL_STATE(10),//婚姻状况
    MORAL_LEVEL(11),//道德评价
    EDUCATION(12),//教育程度
    THIRDACCOUNT_SOURCE(13),//第三方用户来源
    ACCOUNT_STATE(14),  //账号状态
    COMPANY_PAPERS(15), //企业证件
    COMPANY_TYPE(16), //企业类型
    INDUSTRY_TYPE(17), //行业类型
    INFO_LABEL(18), //资讯标签
    POLICY_LABEL(19),//政策标签
    LOAN_PRODUCT_LABEL(20),//贷款产品标签
    LOAN_PURPOSE(21),//贷款目的
    MONEY_UNIT(22),//金额单位
    TIME_UNIT(23),//时间单位
    PROPERTY_TYPE(24),//产权类型
    PLEDG_GUARANTEE(25),//质押担保
    LOAN_SUBJECT(27),//贷款主体
    LOAN_TYPE(28),//贷款类型
    REFUND_TYPE(29),//还款类型
    ORG_SUBCLASS(30),//机构子类
    INFO_RECOMMEND(31),//资讯推荐
    ORG_RECOMMEND(32),//机构推荐
    PRODUCT_TYPE(33),//产品类型
    FINANCIAL_PRODUCT_STATE(34),//金融产品状态
    COMPANY_CHECK_STATE(35), //企业审核状态
    MSG_HANDLE_STATE(36),//信息处理状态
    INVITATION_TYPE(37),//邀约类型
    HANDLE_PERIOD(38),//处理阶段
    HANDLE_TYPE(39),//处理方式
    COMPANY_STATE(40),//企业状态
    POLICY_RECOMMEND(41),//政策推荐
    REQUEST_TYPE(42),//请求类型
    RISKSHARE_FUND_TYPE(43),//风险分担资金类型
    RISKSHARE_HANDLE_STATE(44),//风险分担处理状态
    CREDIT_LEVEL(45),//信用等级
    CERTIFICATE_TYPE(46),//证件类型
    WORKING_TYPE(47),//农户生产经营类型
    MANAGER_LEVEL(48),//农业职业经理人等级
    WARRANT_NAME(49),//权证名称
    SOCIAL_MORAL(50),//社会公德
    BUSINESS_CASE(51),//经营情况
    AWARDS_PUNISHMENTS_TYPE(52),//奖惩类型
    CREDIT_RATING_TYPE(53),//信用评价类型
    HOUSE_TYPE(54),//房屋性质
    MANAGEMENT_CODE_TYPE(55),//经营主体代码类型
    REGISTRATION_TYPE(56),//登记注册类型
    PRODUCTION_MANAGEMENT_TYPE(57),//公司生产经营类型
    PRODUCTION_MANAGEMENT_SCALE_UNIT(58),//生产经营规模单位
    COMPANY_WARRANT_NAME(59),//企业权证名称
    SOCIAL_MORALITY_EVALUATION(60),//社会公德
    OPERATION_SITUATION(61),//经营情况
    COMPANY_HONORARY_GRADE(62),//公司荣誉资质等级
    REWARD_PUNISHMENT(63),//奖励处罚
    COMPANY_CREDIT_RATING_TYPE(64),//企业信用评价类型
    NDT_POLICY_TYPE(65),//农贷通政策
    BIBCOCK_INDUSTRY_TYPE(66),//龙头企业产业类型
    BIBCOCK_COMPANY_TYPE(67),//龙头企业类型
    BIBCOCK_COMPANY_LEVEL(68),//龙头企业类型
    POST_LOAN_STATE(69),//贷后状态
    SOURCE_TYPE(70),//业务消息来源类型，pc app
    MAJOR_PROJECT_TYPE(71),//重点支持项目公司类型
    JOINT_CONFERENCE_PASS_STATE(72),//联席会议审核状态
    APPLY_SOURCE(73)
    ;

    private int value;
    DictType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

}
