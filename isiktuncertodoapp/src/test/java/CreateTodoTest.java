import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class CreateTodoTest extends BaseTest {
    @Test
    public void createNewTodo() throws InterruptedException {

        driver.findElement(By.id("com.example.android.architecture.blueprints.todomvp.mock:id/fab_add_task")).click();
        Thread.sleep(2000);
        driver.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_title").sendKeys("test title");
        Thread.sleep(2000);
        driver.findElementById("com.example.android.architecture.blueprints.todomvp.mock:id/add_task_description").sendKeys("test_desc");
        Thread.sleep(2000);
        driver.findElement(By.id("com.example.android.architecture.blueprints.todomvp.mock:id/fab_edit_task_done")).click();
        Thread.sleep(2000);

        Assert.assertTrue(true);

    }
    }



