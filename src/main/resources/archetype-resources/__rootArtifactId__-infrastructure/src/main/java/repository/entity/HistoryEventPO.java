#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository.entity;

/**
 * 历史事件实体类
 */
public class HistoryEventPO {

    /**
     * 年号
     */
    private String reignTitle;

    /**
     * 历史事件
     */
    private String history;

    public String getReignTitle() {
        return reignTitle;
    }

    public void setReignTitle(String reignTitle) {
        this.reignTitle = reignTitle;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
