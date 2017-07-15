package mongo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zzp.mongo.config.MongoConfig;
import com.zzp.mongo.service.QueryService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MongoConfig.class})

public class Test {
@Autowired	
private QueryService queryService;

//		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MongoConfig.class);
//		QueryService queryService=ctx.getBean(QueryService.class);
@org.junit.Test
public void test(){
		queryService.queryPersonByName()
		;//d
}
	
}
