# CLUB BOLA TSG 1899 Hoffenheim

```js
Nama        : Atik Ahnafi Sulthon,
NIM         : H1D023026,
shift baru  : A,
shift asal  : A, 
```

## Video demo
![Demo Aplikasi](demo.gif)

## Penjelasan Api

Alur data dalam aplikasi dimulai dengan pembentukan objek Retrofit yang dikonfigurasi dengan AuthInterceptor untuk menyertakan kunci API autentikasi, memungkinkan akses ke layanan Football Data API. Selanjutnya, metode getTeam() pada antarmuka FootballApi dipanggil secara asinkron melalui ViewModel, yang mengelola permintaan jaringan dan menangani respons. Data respons yang diterima kemudian dipetakan ke entitas Team menggunakan GsonConverterFactory, memastikan struktur data sesuai dengan model yang telah ditentukan. Akhirnya, data tersebut disajikan di layar melalui aktivitas Coach, History, dan Player, di mana ViewModel mengobservasi perubahan data dan memperbarui antarmuka pengguna secara real-time, memfasilitasi interaksi pengguna dengan informasi tim sepak bola secara efisien.

## Contoh Data dan Kode

Berikut adalah contoh data JSON yang diambil dari API Football Data untuk tim dengan ID 2:

```json
{
  "lastUpdated": "2023-10-24T10:00:00Z",
  "squad": [
    {
      "name": "Manuel Neuer",
      "position": "Goalkeeper",
      "nationality": "Germany",
      "dateOfBirth": "1986-03-27",
      "shirtNumber": 1,
      "marketValue": 15000000,
      "contract": {
        "start": "2011-07-01",
        "until": "2024-06-30"
      }
    },
    {
      "name": "Joshua Kimmich",
      "position": "Defence",
      "nationality": "Germany",
      "dateOfBirth": "1995-02-08",
      "shirtNumber": 6,
      "marketValue": 80000000,
      "contract": {
        "start": "2015-07-01",
        "until": "2025-06-30"
      }
    }
  ],
  "marketValue": 500000000,
  "area": {
    "name": "Germany",
    "code": "DEU"
  },
  "coach": {
    "name": "Thomas Tuchel",
    "firstName": "Thomas",
    "lastName": "Tuchel",
    "dateOfBirth": "1973-08-29",
    "nationality": "Germany",
    "contract": {
      "start": "2023-03-24",
      "until": "2025-06-30"
    }
  },
  "runningCompetitions": [
    {
      "name": "Bundesliga",
      "code": "BL1"
    },
    {
      "name": "UEFA Champions League",
      "code": "CL"
    }
  ]
}
```

Berikut adalah contoh kode Kotlin untuk menampilkan data coach di aktivitas Coach:

```kt
private fun getDataCoach() {
    teamViewModel.getDetailTeam()
    teamViewModel.team.observe(this) { result ->
        result.onSuccess { team ->
            val coach = team.coach
            binding.tvFullName.text = "Full Name: ${coach.firstName} ${coach.lastName}"
            binding.tvName.text = "Name: ${coach.name}"
            binding.tvDateOfBirth.text = "Date of Birth: ${coach.dateOfBirth}"
            binding.tvContract.text = "Contract: From ${coach.contract.start} to ${coach.contract.until}"
            binding.tvNationality.text = "Nationality: ${coach.nationality}"
        }.onFailure { e ->
            e.printStackTrace()
        }
    }
}
```

