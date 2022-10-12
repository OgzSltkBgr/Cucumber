Feature: Trendyol Alisveris Testi

  Scenario: Urunler sepete eklendikten sonra odeme sayfasina gidilebilmeli
    Given kullanici "trendyolUrl" anasayfaya gider
    Then cerezleri kabul eder
    Then trendyol ana sayfasindaki giris yap butonuna tiklar
    Then eposta ve sifre boxlarini doldurur ve giris yapar
    And Elektronik basligi altinda Bilgisayar & Tablet alt basligina tiklar
    Then sol taraftaki ilgili kategorilerden Bilgisayar a tiklar
    Then sol tarafta marka kategorisi altinda Apple i secer
    And ilk urune tiklar
    And kullanici urunu incelemek icin urun fotografinin uzerine mouse'la gider
    And urun fotografinin altindaki urunun diger fotograflarini inceler
    And urunu sepete ekler
    And sepete gider
    And sepeti onaylar
    And test adresi radio butonunun secili oldugunu dogrular
    And kaydet ve devam et butonuna tiklar
    And odeme secenekleri sayfasinda oldugunu dogrular
    And kart bilgilerini girer
    And Lutfen belirtilen alanlari kontrol ediniz uyarisini dogrular
    And siparis ozeti alaninin ekran resmini alir
    #And sayfayi kapatir
