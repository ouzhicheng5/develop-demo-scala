package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum LoanFlowState {

    //已提交
    SUBMITTED(1),
    //受理驳回
    ACCEPT_REJECTED(2),
    //已受理
    ACCEPTED(3),
    //拒绝受理
    REFUSE_ACCEPT(4),
    //调查驳回
    RESEARCH_REJECTED(5),
    //已调查
    RESEARCHED(6),
    //拒绝调查
    REFUSE_RESEARCH(7),
    //初审驳回
    FIRST_TRIAL_REJECTED(8),
    //已初审
    FIRST_TRIALED(9),
    //拒绝初审
    REFUSE_FIRST_TRIAL(10),
    //复审驳回
    RECHECK_REJECTED(11),
    //已复审
    RECHECKED(12),
    //已签订合同
    SIGNED_CONTRACT(13),
    //签订合同失败
    CONTRACT_FAILURE(14),
    //已放款
    HAS_BEEN_LENDING(15),
    //用户向中介机构发起申请
    NEW_APPLY_TO_AGENCY(16),
    //中介机构已受理
    AGENCY_ACCEPTED(17),
    //中介机构拒绝
    AGENCY_REFUSED(18),
    //中介机构已选择产品
    AGENCY_SELECTED(19),
    //中介机构已提交
    AGENCY_SUBMITTED(20),
    //中介机构拒绝提交
    AGENCY_REFUSED_SUBMITTED(21)
    ;

    private int value;
    LoanFlowState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
