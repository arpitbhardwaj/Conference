import com.ab.service.SpeakerService;
import com.ab.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Arpit Bhardwaj
 */
public class Application {

    public static void main(String[] args) {

        //This is the hardcoded injection need to do if we don't use Spring
        //SpeakerService service = new SpeakerServiceImpl();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = context.getBean("speakerService",SpeakerService.class);
        //System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());

        //SpeakerService service2 = context.getBean("speakerService",SpeakerService.class);
        //System.out.println(service2);

    }
}
