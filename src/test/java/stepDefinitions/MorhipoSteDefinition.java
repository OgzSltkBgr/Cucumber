package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.MorhipoPage;
import pages.TrendyolPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MorhipoSteDefinition {
//   MorhipoPage morhipoPage = new MorhipoPage();
//   TrendyolStepDefiniton trendyolStepDefiniton = new TrendyolStepDefiniton();
//   TrendyolPage trendyolPage = new TrendyolPage();
//   int urunSayisiMorhipo;
//   String titleTrendyol;
//   String titleMorhipo;
//   @Then("yeni sekmede morhipo'ya gidiniz")
//   public void yeniSekmedeMorhipoYaGidiniz() {
//       Driver.getDriver().switchTo().newWindow(WindowType.TAB);
//       Driver.getDriver().get("https://www.morhipo.com");
//   }
//   @And("makas aratiniz morhipo")
//   public void makasAratinizMorhipo() {
//       morhipoPage.morhipoSearchBox.sendKeys("makas", Keys.ENTER);
//       titleMorhipo=Driver.getDriver().getTitle();
//   }
//   @Then("toplam urun sayisini aliniz morhipo")
//   public void toplamUrunSayisiniAlinizMorhipo() {
//       String urunSayisi=morhipoPage.morhipoSonucYazisiWE.getText();
//       urunSayisiMorhipo=Integer.parseInt(urunSayisi);
//   }

//   @And("iki sitedeki toplam makas sayisini karsilastiriniz")
//   public void ikiSitedekiToplamMakasSayisiniKarsilastiriniz() {
//       System.out.println("urunSayisiTrendyol = " + trendyolStepDefiniton.urunSayisiTrendyol);
//       System.out.println("urunSayisiMorhipo = " + urunSayisiMorhipo);

//       if (trendyolStepDefiniton.urunSayisiTrendyol>urunSayisiMorhipo){
//           System.out.println("Trendyol urun sayisi morhipon urun sayisindan fazladir");
//       }else{
//           System.out.println("Morhipo urun sayisi Trendyol urun sayisindan fazladir");
//       }
//   }
//   @Then("Once urun sayisi fazla olan siteyi kapatiniz")
//   public void onceUrunSayisiFazlaOlanSiteyiKapatiniz() {
//       ReusableMethods.waitFor(3);
//       if (trendyolStepDefiniton.urunSayisiTrendyol>urunSayisiMorhipo){
//           Driver.getDriver().switchTo().window(titleTrendyol).close();
//       }else {
//           Driver.getDriver().switchTo().window(titleMorhipo).close();
//       }
//   }
//   @And("Sonra diger sayfayida kapatiniz")
//   public void sonraDigerSayfayidaKapatiniz() {
//       ReusableMethods.waitFor(3);
//       Driver.closeDriver();
//   }
}
