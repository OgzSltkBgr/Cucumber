Feature: US1012 demo adresine gidip sutun basligi ile liste alma

  Scenario: TC21 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "demoGuruUrl" anasayfaya gider
    And   "Current Price (Rs)" sutunundaki tum degerleri yazdirir
    #sutun ismini yazdiginda sutunundaki degerleri getirir
    Then sayfayi kapatir