#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.service.impl;

import ${package}.app.command.exe.HistoryEventCmdExe;
import ${package}.app.command.exe.KillYanliangCmdExe;
import ${package}.app.command.query.HistoryQueryExe;
import ${package}.app.service.StoryService;
import ${package}.model.vo.HistoryEventVO;
import ${package}.repository.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 历史故事服务接口实现
 */
@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    PeopleMapper peopleMapper;

    @Autowired
    private KillYanliangCmdExe killYanliangCmdExe;

    @Autowired
    private HistoryQueryExe historyQueryExe;

    @Autowired
    private HistoryEventCmdExe historyEventCmdExe;

    /**
     * 演绎历史
     */
    @Override
    public void performs() {
        killYanliangCmdExe.kill();
    }

    /**
     * 重置历史
     */
    @Override
    public void reset() {
        historyEventCmdExe.reset();
    }

    /**
     * 查询历史
     *
     * @return HistoryEventVO
     */
    @Override
    public HistoryEventVO queryHistory() {
        return historyQueryExe.queryHistory();
    }

}
