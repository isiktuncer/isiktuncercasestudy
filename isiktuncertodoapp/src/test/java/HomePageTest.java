
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.*;

public class HomePageTest extends BaseTest {

@Test
    public void filterButton() {

        driver.findElement(By.id("com.example.android.architecture.blueprints.todomvp.mock:id/menu_filter")).click();

   String actualString = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).getText();
    assertTrue(actualString.contains("Active"));
    }

    @Test
    public void hamburgerMenuButton(){

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

        String actualString = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.i/androidx.appcompat.widget.g0[2]/android.widget.CheckedTextView")).getText();
        assertTrue(actualString.contains("Statistics"));
    }
@Test
    public void moreOptionsButton(){

        driver.findElement(By.xpath("\t\n" +
                "//android.widget.ImageView[@content-desc=\"More options\"]")).click();

    String actualString = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).getText();
    assertTrue(actualString.contains("Refresh"));

    }
}
