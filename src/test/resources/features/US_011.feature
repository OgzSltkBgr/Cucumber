@US011
Feature:US_011 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

  Scenario:TC01 "Create or edit an appointment" işlemlerini yapabilmeli
    Given Doktor "medunnaUrl" sayfasina gider
    Then Doktor sign in butonuna basar
    Then Doktor kullanici adi ve sifre girerek siteye giris yapar
    Then Doktor My Pages butonuna tiklar
    Then Doktor My Appointments butonuna tiklar
    Then Doktor Apponintments sayfasinda edit butonuna tiklar
    Then Doktor id, Start DateTime, End DateTime ve Status un bilgileri oldugunu dogrular
    Then Doktor anemnesis, treatment, diagnosis alanlarini doldurur
    Then Doktor Prescription ve Description alanlarini gerekli ise doldurur
    Then Doktor save butonuna tiklar
    And  Doktor "The Appointment is updated with identifier 302324" mesajini dogrular

  Scenario: TC02 Bir randevu guncellendiginde; kullanici (doktor), hastanin "id, start ve end date, Status, physician ve patient" bilgilerini görebilmeli.
    Then Doktor My Pages butonuna tiklar
    Then Doktor My Appointments butonuna tiklar
    Then Doktor hasta id sinin oldugunu dogrular
    Then Doktor hastaya ait start date time oldugunu dogrular
    Then Doktor hastaya ait end date time oldugunu dogrular
    Then Doktor hastaya ait statusun oldugunu dogrular
    Then Doktor physcian olarak kendi ismini dogrular

  Scenario: TC03 Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarını doldurabilmeli
      Then Doktor Apponintments sayfasinda edit butonuna tiklar
      Then Doktor Create or Edit an Appointment sayfasinda Anamnesis e aciklama girer
      Then Doktor Create or Edit an Appointment sayfasinda Treatment e aciklama girer
      Then Doktor Create or Edit an Appointment sayfasinda Diagnosis e aciklama girer
      And Doktor save butonuna tiklar

  Scenario: TC04 "prescription ve description" alanlarını doldurma isteğe bağlı olmalı.
      Then Doktor My Pages butonuna tiklar
      Then Doktor My Appointments butonuna tiklar
      Then Doktor Apponintments sayfasinda edit butonuna tiklar
      Then Doktor Create or Edit an Appointment sayfasinda prescription sekmesine tiklar, sonra sayfada bos bir alana tiklar
      Then Doktor description ve sekmesine tiklar, sonra sayfada bos bir alana tiklar
      Then Doktor This field is required. uyarisinin olmadigini dogrular

  Scenario: TC05 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmeli.
      Then Doktor Status menusu altinda Completed secer
      Then Doktor Status menusu altinda Cancelled secer
      Then Doktor Status menusu altinda Pending secer






