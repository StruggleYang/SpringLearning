import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.struy.HelloApi;

import java.io.File;

/**
 * author with struy.
 * Create by 2018/1/17 13:41
 */

public class InstantiatingContainerTest {

    @Test
    public void instantiatingContainerByFileSystemOrClassPath(){
        File file = new File("F:\\today\\Springlearning\\src\\main\\resources\\hello.xml");

        Resource resource = new FileSystemResource(file);

        BeanFactory beanFactory = new XmlBeanFactory(resource);

        beanFactory.getBean("hello", HelloApi.class).sayHello();

    }
    @Test
    public void instantiatingContainerByClassPath(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("hello.xml");

        beanFactory.getBean("hello",HelloApi.class).sayHello();
    }
    @Test
    public void instantiatingContainerByFileSystemXml(){

        BeanFactory beanFactory = new FileSystemXmlApplicationContext("F:\\today\\Springlearning\\src\\main\\resources\\hello.xml");

        beanFactory.getBean("hello", HelloApi.class).sayHello();

    }
}
