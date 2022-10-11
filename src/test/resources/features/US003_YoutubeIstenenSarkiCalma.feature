Feature: US1001 Kullanici Youtube'da istenen sarkiyi secer

  Scenario: TC01 Kullanici Youtube'da sarki dinler
    Given Kullanici "youtubeUrl" sayfasina gider
    Then search box a dinlemek istedigi "sarki" adini yazar
    Then acilan sayfada cikan ikinci klibe tiklar
    Then reklamlari atlar
    Then tam ekran yapar
    Then calinmasi istenen "sure" kadar sarki dinler
    Then sag tarafta onerilen sarkilardan ilkine tiklar
    Then reklam cikarsa reklamlari atlar
    Then calinmasi istenen "sure" kadar sarki dinler
    Then youtube ana sayfa ya gider
    And anasayfada oldugunu dogrular
    And pencereyi kapatir
