#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository.entity;

public class HistoryEventPO {

    private String reignTitle;

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
