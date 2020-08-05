package com.proximastudio.kuispintar.db

import android.content.Context
import android.media.MediaPlayer

class Db {
    companion object{

        val soal = arrayOf(

            // UMUM

            arrayOf("Siapakah nama preisden ke-7 Indonesia ?", "Jokowi", "SBY","Soeharto","Habibie","Megawati","a","umum"),
            arrayOf("Dimana Ibukota negara Tiongkok? ?", "Shanghai","Beijing", "Seoul","Wuhan","Toyo","b","umum"),
            arrayOf("Lumpia merupakan makanan khas kota ?", "Makassar", "Solo","Semarang","Jakarta","Bandung","c","umum"),
            arrayOf("Hewan terbesar di yang pernaah hidup di bumi adalah ?", "Brachiosaurus", "Paus biru","Hiu paus","T-Rex","Mamooth","b","umum"),
            arrayOf("Ilmu yang mempelajari tentang manusia disebut ?", "Psikologi", "Homologi","Sosiologi","Geologi","Anthropologi","e","umum"),
            arrayOf("Benua terbesar di dunia adalah ?", "Afrika", "Australia","Amerika","Asia","Antartika","d","umum"),
            arrayOf("Pada tahun berapa kapal titanic tenggelam ?", "1902", "1912","1905","1915","1820","b","umum"),
            arrayOf("Oracle merupakan perusahan yang bergerak pada bidang ?", "Otomotif", "Fashion","Teknologi","Militer","Industri","c","umum"),
            arrayOf("Warna kulit beruang kutub adalah ?", "Cokelat", "Putih","Hitam","Transparan","Pelangi","d","umum"),
            arrayOf("Candi Borobudur terletak di kota ?", "Yogyakarta", "Surakarta","Semarang","Bantul","Magelang","e","umum"),

            arrayOf("Penemu sistem opeasi android adalah ?", "Andy Rubin", "Lary Page","Mark Zuckerberg","Linus Torvalds","Bill Gates","a","umum"),
            arrayOf("Burj Khalifah merupakan bangunan tertinggi yang memiliki ketinggian ?", "621 meter", "828 meter","932 meter","1012 meter","901 meter","b","umum"),
            arrayOf(" Primata tercerdas setelah manusia adalah", "Simpanse", "Orangutan","Kera","Monyet","Gorila","a","umum"),
            arrayOf("Provinsi terluas di Indonesia adalah ?", "Kalimantan Barat", "Kalomantan Timur","Sumatera Barat","Papua","Papua Barat","d","umum"),
            arrayOf("Gunung tertinggi di dunia adalah ?", "Trivor", "Makalu","Krakatau","Fuji","Everest","e","umum"),
            arrayOf("Selain di pulau komodo, hewan komodo juga dapat dijumpaai di ?", "Pulau Rinca", "Sumba","Pulau Seribu","Flores ","Maluku","a","umum"),
            arrayOf("Berikut yang bukan merupakan tahun kabisat adalah ?", "2000", "2002","2004","2016","2028","b","umum"),
            arrayOf("Papan catur memiliki kotak-kotak tempat bidak sebanyak ?", "16", "36","64","82","94","c","umum"),
            arrayOf("Anjing pitbull berasal dari negara?", "Swedia", "Jerman","Denmark","Inggris","Amerika","d","umum"),
            arrayOf("Jenis batuan terkeras adalah ?", "Platinum", "Emas","Berlian","Tembaga","Uranium","c","umum"),

            arrayOf("Negara terkaya di dunia adalah ?", "Amerika Serikat", "Saudi Arabia","Qatar","China","Jerman","c","umum"),
            arrayOf("Mohammed salah adalah pesepakbola asal ?", "Turki","Mesir", "Iran","Maroko","Arab Qatar","b","umum"),
            arrayOf("Negeri Gajah putih merupakan julukan dari negara ?", "Thailand", "Vietnam","Malaysia","Sri Lanka","India","a","umum"),
            arrayOf("Ilmuwan yang menemukan teori relativitas adalah ?", "Stephen Hawking", "Darwin","Albert Einstein","Nikola Tesla","Thomas Alfa Edison","c","umum"),
            arrayOf("Pencipta lukisan monalisa adalah ?", "Rembrandt", "Masaccio","Vincent van Gogh","Pablo Picasso","Leonardo da Vinci","e","umum"),
            arrayOf("Ilmuwan yang menemukan lampu pijar adalah ?", "Stephen Hawking", "Darwin","Albert Einstein","Nikola Tesla","Thomas Alfa Edison","e","umum"),
            arrayOf("Coloseum di Italia terletak di kota ?", "Milan", "Turin","Roma","Venesia","Pisa","c","umum"),
            arrayOf("Sungai terpanjan di dunia adalah ?", "Amazon", "Mekong","Nil","Parana","Musi","c","umum"),
            arrayOf("Samudera terluas adalah ?", "Pasifik", "Atlantik","Hindia","Arktik","Antartika","a","umum"),
            arrayOf("Negara terkecil di dunia adalah ?", "Singapura", "Brunei Darussalam","Timor Leste","Vatikan","Kepulauan Faroe","d","umum"),


            // SAINS

            arrayOf("Kelelawar dapat bergerak di tempat gelap karena memiliki ?", "Sayap", "Sonar","Insting","Naluri","Mata","b","sains"),
            arrayOf("Benda terjatuh terjadi karena adanya gaya?", "Gesek", "Pegas","Gravitasi","Dorong","Tarik","c","sains"),
            arrayOf("Getaran yang merambat disebut dengan ?", "Amplitudo", "Frekuensi","Periode","Gelombang","Bunyi","d","sains"),
            arrayOf("Miopi merupakan nama lain dari ?", "Rabun jauh", "Rabun dekat","Rabun Senja","Kebutaan","Katarak","a","sains"),
            arrayOf("Percepatan benda berbanding lurus dengan gaya dan berbanding terbalik dengan massa , adalah bunyi hukum newton ke- ?", "1", "2","3","4","5","b","sains"),
            arrayOf("Nama unsur pertama dalam tabel periodik adalah ?", "Li", "Ca","H","He","Na","c","sains"),
            arrayOf("Pasang surut air laut disebabkan oleh adanya ?", "Rotasi bumi", "Gravitasi bulan","Revolusi bumi","Revolusi bulan","Rotasi bulan","b","sains"),
            arrayOf("Ilmu yang mempelajari tentang pengelompokkan makhluk hidup disebut ?", "Biologi", "Ekologi","Taksologi","Psikologi","Astronomi","c","sains"),
            arrayOf("Perubahan zat gas menjadi zat cair disebut ?", "Mengembun", "Menyublim","Menguap","Mencair","Mengkristal","a","sains"),
            arrayOf("Organ yang berfungsi menjaga keseimbangan tubuh adalah ?", "Jantung", "Telinga","Hati","Mata","Sumsum tulang belangan","b","sains"),

            arrayOf("Kacamata berlensa cekung digunakan untuk membantu penglihatan penderita ?","Rabun jauh", "Rabun dekat","Hipermetropi","Presbiopi","Rabun senja","a","sains"),
            arrayOf("Titik terjauh pada getaran disebut ?", "Frekuensi", "Periode","Gelombang","Panjang gelombang","Amplitudo","e","sains"),
            arrayOf("Tempat terjadinya pertukaran oksigen dan karbondioksida adalah ?", "Diafragma", "Pleura","Alveolus","Trakrea","Ginjal","c","sains"),
            arrayOf("Hewan yang aktif pada malam hari disebut ?", "Mamalia", "Krepuskular","Diurnal","Abnormsl","Nokturnal","e","sains"),
            arrayOf("Bintang fajar merupakan julukan untuk planet ?", "Merkurius", "Venus","Mars","Uranus","Neptunus","b","sains"),
            arrayOf("Yang bukan merupakan jenis jamur adalah ?", "Basidiomycota", "Ascomycota","Zygomycota","Fungimycota","Deuteromycota","d","sains"),
            arrayOf("Unsur terbesar yang menyusun makhluk hidup adalah ?", "Hidrogen", "Oksigen","Nitrogen","Besi","Karbon","e","sains"),
            arrayOf("Karat pada besi terjadi karena adanya ?", "Pelapukan", "Nitrifikasi","Reduksi","Oksidasi","Respirasi","d","sains"),
            arrayOf("Yang merupakan besaran vektor adalah ?", "Massa", "Percepatan","Tekanan","Kuat arus","Volume","b","sains"),
            arrayOf("Yang bukan termasuk besaran pokok adalah ?", "Intensitas cahaya", "Jumlah zat","Panjang","Gaya","Massa","d","sains"),

            arrayOf("Unsur kimia yang termasuk non logam adalah ?", "Au", "Zn","Cu","He","Fe","d","sains"),
            arrayOf("Platypus berkembang biak dengan cara ?", "Membelah diri", "Ovovivipar","Ovipar","Vivipar","Fragmentasi","b","sains"),
            arrayOf("Amoeba berkembang biak dengan cara ?", "Membelah diri", "Ovovivipar","Ovipar","Vivipar","Fragmentasi","a","sains"),
            arrayOf("Fase lepasnya sel telur dari ovum disebut dengan ?", "Menstruasi", "Fertilisasi","Ejakulasi","Ovulasi","Menopause","d","sains"),
            arrayOf("Fase peleburan sel telur dengan sperma disebut dengan ?", "Menstruasi", "Fertilisasi","Ejakulasi","Ovulasi","Menopause","b","sains"),
            arrayOf("Lapisan terluar dari kulit adalah ?", "Epidermis", "Endodermis","Hipodermis","Kelenjar Keringat ","Dermis","a","sains"),
            arrayOf("Bagian mata yang berfungsi untuk memfokuskan cahaya adalah ?", "Retina", "Lensa","Kornea","Iris","Pupil","b","sains"),
            arrayOf("Sendi pada leher termasuk sendi ?", "Putar", "Geser","Engsel","Pelana","Peluru","a","sains"),
            arrayOf("Yang termasuk tumbuhan monokotil adalah ?", "Mangga", "Jambu biji","Jagung","Singkong","Karet","c","sains"),
            arrayOf("Partikel yang membentuk cahaya disebut ?", "Photon", "Plasma","Proton","Radiasi","LED","a","sains"),

            // TEKNO

            arrayOf("Perangkat dalam komputer yang berfungsi untuk menyimpan data sementara adalah ?", "ROM", "RAM","Floppy","CD","Hard Drive","b","tekno"),
            arrayOf("Teknologi Rontgen pada rumah sakit menggunakan bantuan ?", "Sinar Gama","Sinar Alpha", "Sinar X","Sinar Beta","Sinar UV","c","tekno"),
            arrayOf("Proses pencampuran bahan bakar dengan udara sebelum pembakaran pada mesin disebut ? ?", "Injeksi", "Tuning","Akselerasi","Deselerasi","Turbulensi","a","tekno"),
            arrayOf("Komponen pada mobil yang berfungsi untuk membangkitkan listrik pada mobil adalah ?", "Aki", "Radiator","Suspensi","PCM","Alternator","e","tekno"),
            arrayOf("Yang bukan merupakan perangkat penyimpanan dalam komputer adalah ?", "VGA", "RAM","ROM","Disket","SSD","a","tekno"),
            arrayOf("Berikut yang bukan merupakan komponen utama dalam sistem jaringan adalah ?", "Router", "Switch","Repeater","Mouse","UTP","d","tekno"),
            arrayOf("Satuan yang digunakan untuk mengukur kecepatan rotasi mesin adalah ?","MPH", "RPM","Horse Power","KBps","Hz","b","tekno"),
            arrayOf("Perangkat yang berfungsi sebagai otak dari sebuah komputer adalah ?", "Memory", "Proccesor","Mouse","Keyboard","Power Supply","b","tekno"),
            arrayOf("Komponen dalam mobil yang berfungsi mendinginkan mesin adalah ?", "Radiator", "Cooler","Alternator","Suspensi","Motor","a","tekno"),
            arrayOf("Bahan bakar yang biasa digunakan pada mesin diesel adalah ?", "Bensin", "Minyak Tanah","Solar","Aftur","Gas","c","tekno"),

            arrayOf("Yang merupakan perangkat masukkan pada komputer adalah ?", "Keyboard", "Speaker","Monitor","VGA","Harddisk","a","tekno"),
            arrayOf("Teknologi yang digunakan untuk menentukan lokasi dengan bantuan satelit adalah ?", "4G", "5G","GPS","Internet","kompas","c","tekno"),
            arrayOf("Yang bukan merupakan perusahaan di bidang otomotif adalah ?", "Ford", "Proton","Ferrari","Tesla","Cisco","e","tekno"),
            arrayOf("Yang merupakan perangkat penyimpanan pada komputer adalah ?", "Keyboard", "Speaker","Monitor","VGA","Harddisk","e","tekno"),
            arrayOf("Perangkat yang berfungsi mengubah sinyal analog menjadi digital dan sebaliknya adalah ?", "VGA", "Modem","Proccesor","ROM","RAM","b","tekno"),
            arrayOf("Perusahaan otomotif yang terkenal dengan teknologi mobil listriknya adalah  ?", "Hyundai", "Ferrari","Honda","Tesla","Mitsubishi","d","tekno"),
            arrayOf("IOT nerupakan kependekan dari ?", "Integrated of Things", "Integrated Online Things","Internet of Things","Internet Over Things","Integrated Over Things","c","tekno"),
            arrayOf("Pada komputer, monitor termasuk dalam perangkat ?", "Keluaran", "Masukan","Penyimpanan","Pemrosesan","Jaringan","a","tekno"),
            arrayOf("Bahasa mesin dikenal juga dengan istilah bahasa ?", "Pascal", "ASCII","Biner","C","Java","c","tekno"),
            arrayOf("Pada komputer, harddisk termasuk dalam perangkat ?", "Keluaran", "Masukan","Penyimpanan","Pemrosesan","Jaringan","c","tekno"),

            arrayOf("Teknologi yang biasa digunakan pada uang elektronik adalah ?", "NFC", "Wifi","Bluetooth","GPS","Infrared","a","tekno"),
            arrayOf("Teknologi wireless yang biasa digunakan pada remote klasik adalah ?", "NFC", "Wifi","Bluetooth","GPS","Infrared","e","tekno"),
            arrayOf("Yang bukan merupakan teknologi wireless adalah ?", "LAN", "Wifi","NFC","Bluetooth","Infrared","a","tekno"),
            arrayOf("Teknologi yang menggabungkan dunia nyata dengan objek maya (virtual) adalah ?", "Virtual Reality", "Augmented Reality","3D","Hologram","AI","b","tekno"),
            arrayOf("Nama lain dari kecerdesan buatan adalah ?", "AR", "VR","AI","NFC","Hologram","c","tekno"),
            arrayOf("Bagian dari mobil yang berfungsi menerima tekanan dari pembakaran adalah ?", "Radiator", "Alternator","Akselerator","Piston","Motor","d","tekno"),
            arrayOf("Bagian pada handphone yang berfungsi untuk menangkap suara adalah ?", "Mikrofon", "Speaker","Headphone","Earphone","Bluetooth","a","tekno"),
            arrayOf("Pada saat terjadi komunikasi, data ditransmisikan dalam satuan ?", "bit", "BYTE","hz","KBps","ms","a","tekno"),
            arrayOf("Komponen pada listrik yang berfungsi memberi hambatan pada listrik adalah ?", "Trafo", "Resistor","Dioda","Kapasitor","Baterai","b","tekno"),
            arrayOf("Komponen pada listrik yang berfungsi merubah tegangan listrik adalah ?", "Trafo", "Resistor","Dioda","Kapasitor","Baterai","a","tekno"),


            // HIBURAN

            arrayOf("Film Jurassic Park disutradai oleh ?","James Wann","Todd Phillips","Steven Spielberg","James Cameron","Christoper Nolan","c","hiburan"),
            arrayOf("Kreator serial Naruto adalah ?", "Akira Toriyama","Masashi Kishimoto", "Eichiro Oda","Tite Kubo","Naoshi Arakawa","b","hiburan"),
            arrayOf("Justin Bieber adalah seorang penyanyi berkebangsaan ?", "Kanada", "Inggris","Amerika","Australia","Skotlandia","a","hiburan"),
            arrayOf("Queen adalah band legendaris asal inggris yang dibentuk pada tahun ?", "1972", "1970","1975","1973","1971","b","hiburan"),
            arrayOf("Berikut yang merupakan karya dari Akira Toriyama adalah ?", "Bleach", "Death Note","Dragon Ball","Naruto","One Piece","c","hiburan"),
            arrayOf("Aktor yang berperan sebagai Thor dalam film The Avenger adalah ?", "Chriss Evans", "Chriss Pratt","Chriss Hemsworth","Robert Downey","Tom Holland","c","hiburan"),
            arrayOf("Komik yang berasal dari Korea disebut ?", "Manga", "Manhwa","Manhua","Cartoon","Visual Novel","b","hiburan"),
            arrayOf("Ubisoft merupakan perusahaan video game yang membuat game ?", "Resident Evil", "Grand Theft Auto","FIFA","Pro Evolution Soccer","Far Cry","e","hiburan"),
            arrayOf("Berikut yang merupakan film karya sutradara Christoper Nolan adalah ?", "Jurassic Park", "Intersetellar","Spider-Man","Shawsank Redemption","Jaws","b","hiburan"),
            arrayOf("One Piece merupakan serial komik tekenal yang dibuat oleh ?", "Eichiro Oda", "Masashi Kishimoto","Akira Toriyama","Tite Kubo","Hideaki Sorachi","a","hiburan"),

            arrayOf("Pemeran Peter Parker dalam film Spider-Man karya Sam Raimi adalah ?", "Andrew Garfield", "Tom Holland","Tom Hardy","Chriss Evans","Tobey Maguire","e","hiburan"),
            arrayOf("Hogwarts School adalah salah satu tempat ikonik  yang terdapat dalam film ?", "Game of Thrones", "Harry Potter","Titanic","Jurassic Park","The Avenger","b","hiburan"),
            arrayOf("Robert Downey Jr dalam film Avenger berperan sebagai ?", "Steve Roger", "Tony Stark","Peter Parker","Bucky Barnes","Nick Fury","b","hiburan"),
            arrayOf("Berikut film yang bercerita tentang detektif adalah ?", "Interstellar", "The Shawsank Redemption","Harry Potter","Sherlock Holmes","Inception","d","hiburan"),
            arrayOf("Pemeran utama dalam serial manga Dragon Ball adalah ?", "Gohan", "Trunks","Goku","Vegeta","Bulma","c","hiburan"),
            arrayOf("Love me Like You Do merupakan lagu yang dipopulerkan oleh ?", "Taylor Swift", "Rihanna","Ellie Goulding","Bruno Mars","Justin Bieber","c","hiburan"),
            arrayOf("Studio yang memproduksi video game Grand Theft Auto adalah ?", "Rockstar", "EA Games","Ubisoft","Capcom","Nintendo","a","hiburan"),
            arrayOf("Berikut yang bukan merupakan perusahaan konsol video game adalah ?", "Nintendo", "Sony","Sega","Microsoft","EA Games","e","hiburan"),
            arrayOf("Umbrella merupakan lagu yang dipopulerkan oleh ?", "Taylor Swift", "Rihanna","Ellie Goulding","Bruno Mars","Justin Bieber","b","hiburan"),
            arrayOf("Komik yang berasal dari China disebut ?", "Manga", "Manhwa","Manhua","Cartoon","Visual Novel","c","hiburan"),

            arrayOf("Pemeran Jack dalam film Titanic adalah ?", "Leonardo di Caprio", "Tom Cruise","Bradd Pitt","Gary Oldman","Antonio Banderas","a","hiburan"),
            arrayOf("Thanos merupakan tokoh antagonis pada film ?", "Spider Man", "Avenger","Batman","Superman","Titanic","b","hiburan"),
            arrayOf("Joker merupakan tokoh antagonis pada film ?", "Spider Man", "Avenger","Batman","Superman","Titanic","c","hiburan"),
            arrayOf("Gotham merupakan kota fiktif yang terdapat pada film ?", "Spider Man", "Avenger","Batman","Superman","Titanic","c","hiburan"),
            arrayOf("Video game bertemakan Zombie buatan CAPCOM adalah ?", "The Last of Us", "Days Gone","The Walking Dead","DreadOut","Resident Evil","e","hiburan"),
            arrayOf("Video game bertemakan horror buatan studio asal Indonesia, Digital Happiness adalah ?", "The Last of Us", "Days Gone","The Walking Dead","DreadOut","Resident Evil","d","hiburan"),
            arrayOf("The Beatless merupakan band legendaris asal ?", "Amerika Serikat", "Inggris","Kanada","Australia","Irlandia","b","hiburan"),
            arrayOf("Westlife merupakan boyband legendaris yang berasal dari ?", "Amerika Serikat", "Inggris","Kanada","Australia","Irlandia","e","hiburan"),
            arrayOf("Film Parasite yang berhasil memenangi piala oscar berasal dari negara ?", "Amerika Serikat", "Inggris","Jepang","Korea Selatan","Kanada","d","hiburan"),
            arrayOf("Berikut yang bukan merupakan film dari marvel studio adalah ?", "Spider Man", "Iron Man","Superman","Captain America","Thor","c","hiburan")


            )




        var isClassic = true
        var category = "default"
        var score = 0
        val interstitialID = "ca-app-pub-8201627220488781/7384950320"





        fun playSound(source: Int, context: Context) {
            val mediaPlayer = MediaPlayer.create(context, source)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.stop();
                mediaPlayer.release();
            }


        }

    }

}