@US010
Feature: Doktor (Physician) randevuları

  Scenario: TC01 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given Doktor "medunnaUrl" sayfasina gider
    Then Doktor sign in butonuna basar
    Then Doktor kullanici adi ve sifre girerek siteye giris yapar
    Then Doktor My Pages butonuna tiklar
    Then Doktor My Appointments butonuna tiklar
    And Doktor Appointments altinda from sekmesinin altinda tarih goruldugunu dogrular
    And Doktor Appointments altinda to sekmesinin altinda tarih goruldugunu dogrular

  Scenario: TC02 Doktor "patient id, start date, end date, status" bilgilerini görebilmeli
    Then Doktor My Pages butonuna tiklar
    Then Doktor My Appointments butonuna tiklar
    Then Doktor hasta id sinin oldugunu dogrular
    Then Doktor hastaya ait start date time oldugunu dogrular
    Then Doktor hastaya ait end date time oldugunu dogrular
    Then Doktor hastaya ait statusun oldugunu dogrular
