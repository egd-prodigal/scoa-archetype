#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.service.impl;

import ${package}.app.command.HistoryEventCmdExe;
import ${package}.app.command.KillYanliangCmdExe;
import ${package}.app.command.query.HistoryQueryExe;
import ${package}.app.converter.HistoryEventConverter;
import ${package}.model.vo.HistoryEventVO;
import ${package}.app.service.StoryService;
import ${package}.model.domain.Camp;
import ${package}.model.domain.General;
import ${package}.model.domain.Lord;
import ${package}.model.domain.Warrior;
import ${package}.model.factory.DomainObjectFactory;
import ${package}.repository.entity.HistoryEventPO;
import ${package}.repository.mapper.HistoryEventMapper;
import ${package}.repository.mapper.PeopleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {

    private final Logger logger = LoggerFactory.getLogger(StoryServiceImpl.class);

    @Autowired
    PeopleMapper peopleMapper;

    @Autowired
    private KillYanliangCmdExe killYanliangCmdExe;

    @Autowired
    private HistoryQueryExe historyQueryExe;

    @Autowired
    private HistoryEventCmdExe historyEventCmdExe;

    @Override
    public void performs() {
        killYanliangCmdExe.kill();
    }

    @Override
    public void reset() {
        historyEventCmdExe.reset();
    }

    @Override
    public HistoryEventVO queryHistory() {
        return historyQueryExe.queryHistory();
    }

}
