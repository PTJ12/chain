package top.xpit.ums.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobContext;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author PTJ
 * @date 2023/9/7 1:03
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class TestJob {

    @XxlJob(value = "testHandler")
    public ReturnT<String> excute(String param) throws Exception{
        XxlJobHelper.log("job is start");
        param = XxlJobContext.getXxlJobContext().getJobParam();
        log.info(param);
        log.info("----------------------> job");
        XxlJobHelper.log("job is stop");
        return ReturnT.SUCCESS;
    }
}
