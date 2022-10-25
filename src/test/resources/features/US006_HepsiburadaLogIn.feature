Feature: US006 Hepsiburada.com Login Test

  Scenario: Kullanici Login Olur
    Given kullanici "hepsiburadaUrl" sayfasina gider
    Then kullanici imleci giris yap butonu uzerine goturur
    Then kullanici giris yap butonuna tiklar
    Then kullanici eposta adresi girer
    Then kullanici sifre girer
    And kullanici giris yapildigini dogrular