League league =
League.builder().leagueName("Trendyol Super Lig").season("2024-2025").division(1).region(ERegion.TURKISH_LEAGUE).seasonStartDate(LocalDate.parse("2024-08-23")).seasonEndDate(LocalDate.parse("2025-06-01")).build();
		
		Team team1=
				Team.builder().league(entityManager.find(League.class,1L)).teamName("Galatasaray").transferBudget(1D).wageBudget(1D).stadiumName(
						"Rams Park").teamLocation("Istanbul").build();
		Team team2=Team.builder().league(entityManager.find(League.class,1L)).teamName("Fenerbahce").transferBudget(1D).wageBudget(1D).stadiumName(
				"Sukru Saracoglu Stadyumu").teamLocation("Istanbul").build();
		Team team3=Team.builder().league(entityManager.find(League.class,1L)).teamName("Besiktas").transferBudget(1D).wageBudget(1D).stadiumName(
				"Tupras Stadyumu").teamLocation("Istanbul").build();
		Team team4=Team.builder().league(entityManager.find(League.class,1L)).teamName("Trabzonspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Avni Aker Stadyumu").teamLocation("Trabzon").build();
		Team team5=Team.builder().league(entityManager.find(League.class,1L)).teamName("Basaksehir").transferBudget(1D).wageBudget(1D).stadiumName(
				"Fatih Terim Stadyumu").teamLocation("Istanbul").build();
		Team team6=
				Team.builder().league(entityManager.find(League.class,1L)).teamName("Caykur Rizespor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Caykur Stadyumu").teamLocation("Rize").build();
		Team team7=Team.builder().league(entityManager.find(League.class,1L)).teamName("Samsunspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"19 Mayis Stadyumu").teamLocation("Samsun").build();
		Team team8=Team.builder().league(entityManager.find(League.class,1L)).teamName("Kayserispor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Kadir Has Stadyumu").teamLocation("Kayseri").build();
		Team team9=Team.builder().league(entityManager.find(League.class,1L)).teamName("Eyupspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Arda Turan Stadyumu").teamLocation("Istanbul").build();
		Team team10=Team.builder().league(entityManager.find(League.class,1L)).teamName("Antalyaspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Antalya Stadi").teamLocation("Antalya").build();
		Team team11=
				Team.builder().league(entityManager.find(League.class,1L)).teamName("Adana Demirspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Yeni Adana Stadyumu").teamLocation("Adana").build();
		Team team12=Team.builder().league(entityManager.find(League.class,1L)).teamName("Alanyaspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Oba Stadyumu").teamLocation("Antalya").build();
		Team team13=Team.builder().league(entityManager.find(League.class,1L)).teamName("Sivasspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"4 Eylul Stadi").teamLocation("Sivas").build();
		Team team14=Team.builder().league(entityManager.find(League.class,1L)).teamName("Kasimpasa").transferBudget(1D).wageBudget(1D).stadiumName(
				"Recep Tayyip Erdogan Stadyumu").teamLocation("Istanbul").build();
		Team team15=Team.builder().league(entityManager.find(League.class,1L)).teamName("Konyaspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Konya Buyuksehir Stadyumu").teamLocation("Konya").build();
		Team team16=
				Team.builder().league(entityManager.find(League.class,1L)).teamName("Gaziantep FK").transferBudget(1D).wageBudget(1D).stadiumName(
				"Kalyon Stadyumu").teamLocation("Gaziantep").build();
		Team team17=Team.builder().league(entityManager.find(League.class,1L)).teamName("Hatayspor").transferBudget(1D).wageBudget(1D).stadiumName(
				"Mersin Stadyumu").teamLocation("Hatay").build();
		Team team18=Team.builder().league(entityManager.find(League.class,1L)).teamName("Goztepe").transferBudget(1D).wageBudget(1D).stadiumName(
				"Gursel Aksel Stadyumu").teamLocation("Izmir").build();
		Team team19=Team.builder().league(entityManager.find(League.class,1L)).teamName("Bodrum FK").transferBudget(1D).wageBudget(1D).stadiumName(
				"Bodrum Ilce Stadi").teamLocation("Mugla").build();
		Team team20=Team.builder().league(entityManager.find(League.class,1L)).teamName("BYE").transferBudget(1D).wageBudget(1D).stadiumName(
				"0").teamLocation("0").build();

saveTeams(team1);
saveTeams(team2);
saveTeams(team3);
saveTeams(team4);
saveTeams(team5);
saveTeams(team6);
saveTeams(team7);
saveTeams(team8);
saveTeams(team9);
saveTeams(team10);
saveTeams(team11);
saveTeams(team12);
saveTeams(team13);
saveTeams(team14);
saveTeams(team15);
saveTeams(team16);
saveTeams(team17);
saveTeams(team18);
saveTeams(team19);

Manager manager1 = Manager.builder()
.personName("Jose")
.personSurname("Mourinho")
.personAge(61)
.personNationality("Portugal")
.managerUserName("jose")
.managerPassword("1234")
.team(entityManager.find(Team.class, 2))
.build();

		Manager manager2 = Manager.builder()
		                          .personName("Okan")
		                          .personSurname("Buruk")
		                          .personAge(50)
		                          .personNationality("Turkiye")
		                          .managerUserName("okan")
		                          .managerPassword("1234")
		                          .team(entityManager.find(Team.class, 1))
		                          .build();
		
		Manager manager3 = Manager.builder()
		                          .personName("Giovanni van")
		                          .personSurname("Bronckhorst")
		                          .personAge(49)
		                          .personNationality("Netherlands")
		                          .managerUserName("giovanni")
		                          .managerPassword("1234")
		                          .team(entityManager.find(Team.class, 3))
		                          .build();
		
		Manager manager4 = Manager.builder()
		                          .personName("Abdullah")
		                          .personSurname("Avci")
		                          .personAge(61)
		                          .personNationality("Turkiye")
		                          .managerUserName("abdullah")
		                          .managerPassword("1234")
		                          .team(entityManager.find(Team.class, 4))
		                          .build();
		
		Manager manager5 = Manager.builder()
		                          .personName("Cagdas")
		                          .personSurname("Atan")
		                          .personAge(44)
		                          .personNationality("Turkiye")
		                          .managerUserName("cagdas")
		                          .managerPassword("6783")
		                          .team(entityManager.find(Team.class, 5))
		                          .build();
		
		Manager manager6 = Manager.builder()
		                          .personName("İlhan")
		                          .personSurname("Palut")
		                          .personAge(47)
		                          .personNationality("Turkiye")
		                          .managerUserName("ilhan")
		                          .managerPassword("5214")
		                          .team(entityManager.find(Team.class, 6))
		                          .build();
		
		Manager manager7 = Manager.builder()
		                          .personName("Thomas")
		                          .personSurname("Reis")
		                          .personAge(50)
		                          .personNationality("Germany")
		                          .managerUserName("thomas")
		                          .managerPassword("4325")
		                          .team(entityManager.find(Team.class, 7))
		                          .build();
		
		Manager manager8 = Manager.builder()
		                          .personName("Burak")
		                          .personSurname("Yılmaz")
		                          .personAge(39)
		                          .personNationality("Turkiye")
		                          .managerUserName("burak")
		                          .managerPassword("3675")
		                          .team(entityManager.find(Team.class, 8))
		                          .build();
		
		Manager manager9 = Manager.builder()
		                          .personName("Arda")
		                          .personSurname("Turan")
		                          .personAge(37)
		                          .personNationality("Turkiye")
		                          .managerUserName("Arda")
		                          .managerPassword("9999")
		                          .team(entityManager.find(Team.class, 9))
		                          .build();
		
		Manager manager10 = Manager.builder()
		                           .personName("Alex")
		                           .personSurname("DeSouza")
		                           .personAge(46)
		                           .personNationality("Brazil")
		                           .managerUserName("Alex")
		                           .managerPassword("9876")
		                           .team(entityManager.find(Team.class, 10))
		                           .build();
		Manager manager11 =
				Manager.builder().personName("Michael").personSurname("Valkanis").personAge(40).personNationality("Avustralia")
				       .managerUserName("Michi").managerPassword("5432").team(entityManager.find(Team.class, 11)).build();
		
		Manager manager12 =
				Manager.builder().personName("Fatih").personSurname("Tekke").personAge(46).personNationality("Turkiye")
				       .managerUserName("Fatih").managerPassword("2468").team(entityManager.find(Team.class, 12)).build();
		
		Manager manager13 =
				Manager.builder().personName("Bülent").personSurname("Uygun").personAge(53).personNationality("Turkiye")
				       .managerUserName("bulent").managerPassword("1234").team(entityManager.find(Team.class, 13)).build();
		
		Manager manager14 =
				Manager.builder().personName("Sami").personSurname("Ugurlu").personAge(46).personNationality("Turkiye")
				       .managerUserName("sami").managerPassword("1234").team(entityManager.find(Team.class, 14)).build();
		
		Manager manager15 =
				Manager.builder().personName("Ali").personSurname("Camdali").personAge(40).personNationality("Turkiye")
				       .managerUserName("ali").managerPassword("1234").team(entityManager.find(Team.class, 15)).build();
		
		Manager manager16 =
				Manager.builder().personName("Selcuk").personSurname("Inan").personAge(39).personNationality("Turkiye")
				       .managerUserName("selcuk").managerPassword("1234").team(entityManager.find(Team.class, 16)).build();
		
		Manager manager17 =
				Manager.builder().personName("Ozhan").personSurname("Pulat").personAge(39).personNationality("Turkiye")
				       .managerUserName("ozhan").managerPassword("1234").team(entityManager.find(Team.class, 17)).build();
		
		Manager manager18 =
				Manager.builder().personName("Stanimir").personSurname("Stoilov").personAge(57).personNationality("Bulgaria")
				       .managerUserName("stanimir").managerPassword("1234").team(entityManager.find(Team.class, 18)).build();
		
		Manager manager19 =
				Manager.builder().personName("Ismet").personSurname("Tasdemir").personAge(50).personNationality("Turkiye")
				       .managerUserName("ismet").managerPassword("1234").team(entityManager.find(Team.class, 19)).build();
		
		saveManager(manager1);
		saveManager(manager2);
		saveManager(manager3);
		saveManager(manager4);
		saveManager(manager5);
		saveManager(manager6);
		saveManager(manager7);
		saveManager(manager8);
		saveManager(manager9);
		saveManager(manager10);
		saveManager(manager11);
		saveManager(manager12);
		saveManager(manager13);
		saveManager(manager14);
		saveManager(manager15);
		saveManager(manager16);
		saveManager(manager17);
		saveManager(manager18);
		saveManager(manager19);

TechnicalAttributes ta =
TechnicalAttributes.builder().finishing(10).pass(10).dribbling(10).tackle(10).shotPower(10).crossing(10).header(10).positioning(10).firstTouch(10).build();
MentalAttributes ma = MentalAttributes.builder().composure(10).vision(10).decisionMaking(10).build();
PhysicalAttributes pa =
PhysicalAttributes.builder().stamina(10).speed(10).strength(10).jumping(10).height(10).build();
GKAttributes gkAtt = GKAttributes.builder().diving(10).oneOnOne(10).positioning(10).reflexes(10).build();

		saveTechnical(ta);
		saveMental(ma);
		savePhysical(pa);
		saveGKAtt(gkAtt);

String[] names =
{"Ahmet", "Baris", "Can", "Deniz", "Efe", "Fikret", "Gokhan", "Huseyin", "Ibrahim", "Kamil", "Levent",
"Mehmet", "Nadir", "Onur", "Rifat", "Selim", "Tuna", "Umut", "Veli"};
String[] surnames = {"Yilmaz", "Celik", "Ozturk", "Ozcan", "Kaya", "Kilic"};
Integer[] ages = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
String nationality = "Turkiye";
Double wage = 1d;
Double salary = 1d;
EPosition[] positions =
{EPosition.GK, EPosition.CB, EPosition.LB, EPosition.RB, EPosition.CM, EPosition.LW, EPosition.RW,
EPosition.ST};

		Random psur = new Random();
		psur.nextInt(0, surnames.length);

		Random pages = new Random();
		pages.nextInt(0, ages.length);

		Random ppos = new Random();
		ppos.nextInt(0, ages.length);


		
			Player player =
					Player.builder().personName(names[0]).personSurname(surnames[psur.nextInt(surnames.length)])
			                      .personAge(ages[pages.nextInt(ages.length)]).personNationality(nationality)
			                      .playerValue(1d).playerWage(1d)
			                      .playerTechnicalAttributes(entityManager.find(TechnicalAttributes.class, 1d))
			                      .playerMentalAttributes(entityManager.find(MentalAttributes.class, 1d))
			                      .playerPhysicalAttributes(entityManager.find(PhysicalAttributes.class, 1d))
			                      .team(entityManager.find(Team.class, 2d)).playersPosition(EPosition.ST).build();
			
			savePlayer(player);

Double count = 1d;
while (count < 20d) {
TeamStats ts = TeamStats.builder().teamLeague(entityManager.find(League.class, 1d))
.team(entityManager.find(Team.class, count)).totalPoint(0).goalScored(0).goalConceded(0).average(0)
.gamesPlayed(0).gamesWon(0).gamesLost(0).gamesDrawn(0).build();
count++;
saveTeamStats(ts);
}

leagueTeamIDList.add(1);
leagueTeamIDList.add(2);
leagueTeamIDList.add(3);
leagueTeamIDList.add(4);
leagueTeamIDList.add(5);
leagueTeamIDList.add(6);
leagueTeamIDList.add(7);
leagueTeamIDList.add(8);
leagueTeamIDList.add(9);
leagueTeamIDList.add(10);
leagueTeamIDList.add(11);
leagueTeamIDList.add(12);
leagueTeamIDList.add(13);
leagueTeamIDList.add(14);
leagueTeamIDList.add(15);
leagueTeamIDList.add(16);
leagueTeamIDList.add(17);
leagueTeamIDList.add(18);
leagueTeamIDList.add(19);
leagueTeamIDList.add(20);

public static void generateFixtures() {
League league = entityManager.find(League.class, 1);  // 1d yerine 1 kullanıyoruz

		LocalDate matchDate = league.getSeasonStartDate();
		Team homeTeam;
		Team awayTeam;
		Match match = null;
		
		List<Integer> leagueTeamIDList = new ArrayList<>();
		// Takım ID'lerini listeye ekliyorsunuz
		for (int i = 1; i <= 20; i++) {
			leagueTeamIDList.add(i);
		}
		
		int leagueSize = leagueTeamIDList.size();
		int rounds = ((leagueSize * 2) - 2);
		
		for (int round = 1; round <= rounds; round++) {
			LocalDate[] matchDates = getWeekMatchDates(matchDate);
			boolean reverseHomeAway = (round % 2 == 0);
			for (int i = 0; i < leagueSize / 2; i++) {
				// Takımları bulurken Integer tipinde ID kullanıyoruz
				homeTeam = entityManager.find(Team.class, leagueTeamIDList.get(i));
				awayTeam = entityManager.find(Team.class, leagueTeamIDList.get(leagueSize - 1 - i));
				
				// Ev sahibi ve deplasman takımını değiştirme
				if (reverseHomeAway) {
					Team temp = homeTeam;
					homeTeam = awayTeam;
					awayTeam = temp;
				}
				
				// Fikstür oluşturma
				if (homeTeam == entityManager.find(Team.class, 1)) {
					Random random = new Random();
					match = Match.builder().homeTeam(homeTeam)
					             .awayTeam(awayTeam)
					             .matchDate(matchDates[random.nextInt(0, 4)])
					             .status(EMatchStatus.SCHEDULED)
					             .league(league)
					             .homeTeamScore(0)
					             .awayTeamScore(0)
					             .build();
				} else {
					match = Match.builder().homeTeam(homeTeam)
					             .awayTeam(awayTeam)
					             .matchDate(matchDates[i % 4])
					             .status(EMatchStatus.SCHEDULED)
					             .league(league)
					             .homeTeamScore(0)
					             .awayTeamScore(0)
					             .build();
				}
				
				// Maçı kaydetme
				saveMatch(match);
			}
			// Takım listesini rotasyona sokma
			Collections.rotate(leagueTeamIDList.subList(1, leagueSize), 1);
			matchDate = matchDate.plusWeeks(1);
		}
	}
	
	
	private static LocalDate[] getWeekMatchDates(LocalDate startDate) {
		return new LocalDate[]{startDate, // Friday
				startDate.plusDays(1), // Saturday
				startDate.plusDays(2), // Sunday
				startDate.plusDays(3) // Monday
		};
	}