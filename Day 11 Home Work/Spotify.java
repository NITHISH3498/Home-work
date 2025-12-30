import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("SPOTIFY WELCOMES YOU");
		System.out.println("1. A.R.RAHMAN");
		System.out.println("2. ANIRUDH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.println("4. ILLAIYARAJA");
		System.out.println("5. U1");
		System.out.println("Choose Your Artist : ");
		int artist = sc.nextInt();
		if(artist==1)
		{
			System.out.println("You have choosed A.R.Rahman playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Choose Your SONG TYPE : ");
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("You have choosed A.R.Rahman playlist - Melody hits");
				System.out.println("1. Netru Illadha Matram");
				System.out.println("2. Enna Solla Pogirai");
				System.out.println("3. Ennavale Adi Ennavale");
				System.out.println("4. Malargale Malargarle");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Netru Illadha Matram");
				}
				else if(song==2)
				{
					System.out.println("Playing Enna Solla Pogirai");
				}
				else if(song==3)
				{
					System.out.println("Playing Ennavale Adi Ennavale");
				}
				else if(song==4)
				{
					System.out.println("Playing Malargale Malargale");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==2)
			{
				System.out.println("You have choosed A.R.Rahman playlist - Kuthu hits");
				System.out.println("1. THAIYA THAIYA");
				System.out.println("2. MUKKALA MUKKABALA");
				System.out.println("3. URVASHI URVASHI");
				System.out.println("4. AATHICHUDI");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing THAIYA THAIYA");
				}
				else if(song==2)
				{
					System.out.println("Playing MUKKALA MUKKABALA");
				}
				else if(song==3)
				{
					System.out.println("Playing URVASHI URVASHI");
				}
				else if(song==4)
				{
					System.out.println("Playing AATHICHUDI");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==3)
			{
				System.out.println("You have choosed A.R.Rahman playlist - Motivational songs");
				System.out.println("1. Vande Mataram");
				System.out.println("2. Oruvan Oruvan mudhalali");
				System.out.println("3. Shakthi kodu");
				System.out.println("4. Kappal Yeari Poyachu");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Vande Mataram");
				}
				else if(song==2)
				{
					System.out.println("Playing Oruvan Oruvan mudhalali");
				}
				else if(song==3)
				{
					System.out.println("Playing Shakthi kodu");
				}
				else if(song==4)
				{
					System.out.println("Playing Kappal Yeari Poyachu");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==4)
			{
				System.out.println("You have choosed A.R.Rahman playlist - Sad songs");
				System.out.println("1. Poongatrile");
				System.out.println("2. Marudaani");
				System.out.println("3. Minnalea En vazhvin");
				System.out.println("4. Rasathi");
				System.out.println("5. Oru poiyavathu Sol");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Poongatrile");
				}
				else if(song==2)
				{
					System.out.println("Playing Marudaani");
				}
				else if(song==3)
				{
					System.out.println("Playing Minnalea En vazhvin");
				}
				else if(song==4)
				{
					System.out.println("Playing Rasathi");
				}
				else if(song==5)
				{
					System.out.println("Oru poiyavathu Sol");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else
			{
				System.out.println("SORRY , YOUR SONG TYPE IS NOT AVAILABLE");
			}
		}
		else if(artist==2)
		{
			System.out.println("You have choosed ANIRUDH playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Choose Your SONG TYPE : ");
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("You have choosed ANIRUDH playlist - Melody hits");
				System.out.println("1. Neeyum Nanum Anbe");
				System.out.println("2. Velicha Poove");
				System.out.println("3. Po Indru Neeyaga");
				System.out.println("4. Nee partha vizhigal");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Neeyum Nanum Anbe");
				}
				else if(song==2)
				{
					System.out.println("Playing Velicha Poove");
				}
				else if(song==3)
				{
					System.out.println("Playing Po Indru Neeyaga");
				}
				else if(song==4)
				{
					System.out.println("Playing Nee partha vizhigal");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==2)
			{
				System.out.println("You have choosed ANIRUDH playlist - Kuthu hits");
				System.out.println("1. Vaathi Raid");
				System.out.println("2. Naa Ready");
				System.out.println("3. Badass");
				System.out.println("4. Vandha Edam");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Vaathi Raid");
				}
				else if(song==2)
				{
					System.out.println("Playing Naa Ready");
				}
				else if(song==3)
				{
					System.out.println("Playing Badass");
				}
				else if(song==4)
				{
					System.out.println("Playing Vandha Edam");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==3)
			{
				System.out.println("You have choosed ANIRUDH playlist - Motivational songs");
				System.out.println("1. Velai Illa pattathari");
				System.out.println("2. Boomi Enna Suthudhe");
				System.out.println("3. Ethir Neechal");
				System.out.println("4. Surviva");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Velai Illa pattathari");
				}
				else if(song==2)
				{
					System.out.println("Playing Boomi Enna Suthudhe");
				}
				else if(song==3)
				{
					System.out.println("Playing Ethir Neechal");
				}
				else if(song==4)
				{
					System.out.println("Playing Surviva");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==4)
			{
				System.out.println("You have choosed ANIRUDH playlist - Sad songs");
				System.out.println("1. Porkanda Singam");
				System.out.println("2. Kanave Kanave");
				System.out.println("3. Kannaana Kanne");
				System.out.println("4. Jodi Nilave");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Porkanda Singam");
				}
				else if(song==2)
				{
					System.out.println("Playing Kanave Kanave");
				}
				else if(song==3)
				{
					System.out.println("Playing Kannaana Kanne");
				}
				else if(song==4)
				{
					System.out.println("Playing Jodi Nilave");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else
			{
				System.out.println("SORRY , YOUR SONG TYPE IS NOT AVAILABLE");
			}
		}
		else if(artist==3)
		{
			System.out.println("You have choosed HARISH JEYARAJ playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.println("Choose Your SONG TYPE : ");
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("You have choosed HARISH JEYARAJ playlist - Melody hits");
				System.out.println("1. Unnale");
				System.out.println("2. Annul Maele");
				System.out.println("3. Yedho Ondru");
				System.out.println("4. Vaseegara");
				System.out.println("5. Paartha Mudhal");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Unnale");
				}
				else if(song==2)
				{
					System.out.println("Playing Annul Maele");
				}
				else if(song==3)
				{
					System.out.println("Playing Yedho Ondru");
				}
				else if(song==4)
				{
					System.out.println("Playing Vaseegara");
				}
				else if(song==5)
				{
					System.out.println("Playing Paartha Mudhal");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==2)
			{
				System.out.println("You have choosed HARISH JEYARAJ playlist - Kuthu hits");
				System.out.println("1. Tirunelveli Halwa Da");
				System.out.println("2. Aradi katre");
				System.out.println("3. Soda Bottle");
				System.out.println("4. Aruva Meesai");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Tirunelveli Halwa Da");
				}
				else if(song==2)
				{
					System.out.println("Playing Aradi katre");
				}
				else if(song==3)
				{
					System.out.println("Playing Soda Bottle");
				}
				else if(song==4)
				{
					System.out.println("Playing Aruva Meesai");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			
			else if(option==3)
			{
				System.out.println("You have choosed HARISH JEYARAJ playlist - Sad songs");
				System.out.println("1. Venmathiye");
				System.out.println("2. Oh maname");
				System.out.println("3. Yamma Yamma");
				System.out.println("4. Othayile");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Venmathiye");
				}
				else if(song==2)
				{
					System.out.println("Playing Oh maname");
				}
				else if(song==3)
				{
					System.out.println("Playing Yamma Yamma");
				}
				else if(song==4)
				{
					System.out.println("Playing Othayile");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else
			{
				System.out.println("SORRY , YOUR SONG TYPE IS NOT AVAILABLE");
			}
		}
		else if(artist==4)
		{
			System.out.println("You have choosed ILLAIYARAJA playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.println("Choose Your SONG TYPE : ");
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("You have choosed ILLAIYARAJA playlist - Melody hits");
				System.out.println("1. Oru kili uruguthu");
				System.out.println("2. Kuzhaloodhum kannanukku");
				System.out.println("3. Ennai thottu");
				System.out.println("4. Raja Raja cholan");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Oru kili uruguthu");
				}
				else if(song==2)
				{
					System.out.println("Playing Kuzhaloodhum kannanukku");
				}
				else if(song==3)
				{
					System.out.println("Playing Ennai thottu");
				}
				else if(song==4)
				{
					System.out.println("Playing Raja Raja cholan");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==2)
			{
				System.out.println("You have choosed ILLAIYARAJA playlist - Kuthu hits");
				System.out.println("1. Ooruvittu ooruvanthu");
				System.out.println("2. Nooru varusham");
				System.out.println("3. Aasai Nooruvagai");
				System.out.println("4. Aasai Athigam vachu");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Ooruvittu ooruvanthu");
				}
				else if(song==2)
				{
					System.out.println("Playing Nooru varusham");
				}
				else if(song==3)
				{
					System.out.println("Playing Aasai Nooruvagai");
				}
				else if(song==4)
				{
					System.out.println("Playing Aasai Athigam vachu");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			
			else if(option==3)
			{
				System.out.println("You have choosed ILLAIYARAJA playlist - Sad songs");
				System.out.println("1. Kanne Kalaimane");
				System.out.println("2. Thene thenpaandi Neeye");
				System.out.println("3. Paadi Parantha Killi");
				System.out.println("4. Nilave Vaa");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Kanne Kalaimane");
				}
				else if(song==2)
				{
					System.out.println("Playing Thene thenpaandi Neeye");
				}
				else if(song==3)
				{
					System.out.println("Playing Paadi Parantha Killi");
				}
				else if(song==4)
				{
					System.out.println("Playing Nilave Vaa");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else
			{
				System.out.println("SORRY , YOUR SONG TYPE IS NOT AVAILABLE");
			}
		}
		
		else if(artist==5)
		{
			System.out.println("You have choosed U1 playlist");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Choose Your SONG TYPE : ");
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("You have choosed U1 playlist - Melody hits");
				System.out.println("1. Netru illadha Matram");
				System.out.println("2. Enna Solla Pogirai");
				System.out.println("3. Ennavale Adi Ennavale");
				System.out.println("4. Malargale Malargale");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Netru illadha Matram");
				}
				else if(song==2)
				{
					System.out.println("Playing Enna Solla Pogirai");
				}
				else if(song==3)
				{
					System.out.println("Playing Ennavale Adi Ennavale");
				}
				else if(song==4)
				{
					System.out.println("Playing Malargale Malargale");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==2)
			{
				System.out.println("You have choosed U1 playlist - Kuthu hits");
				System.out.println("1. Thaiya Thaiya");
				System.out.println("2. Mukkala Mukkabala");
				System.out.println("3. Urvashi Urvashi");
				System.out.println("4. Aathichudi");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Thaiya Thaiya");
				}
				else if(song==2)
				{
					System.out.println("Playing Mukkala Mukkabala");
				}
				else if(song==3)
				{
					System.out.println("Playing Urvashi Urvashi");
				}
				else if(song==4)
				{
					System.out.println("Playing Aathichudi");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==3)
			{
				System.out.println("You have choosed U1 playlist - Motivational songs");
				System.out.println("1. Vande Mataram");
				System.out.println("2. Oruvan Oruvan mudhalli");
				System.out.println("3. Shakthi kodu");
				System.out.println("4. Kappal Yeari Poyachu");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Vande Mataram");
				}
				else if(song==2)
				{
					System.out.println("Playing Oruvan Oruvan mudhalli");
				}
				else if(song==3)
				{
					System.out.println("Playing Shakthi kodu");
				}
				else if(song==4)
				{
					System.out.println("Playing Kappal Yeari Poyachu");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else if(option==4)
			{
				System.out.println("You have choosed U1 playlist - Sad songs");
				System.out.println("1. Poongatrile");
				System.out.println("2. Marudaani");
				System.out.println("3. Minnalea En vazhvin");
				System.out.println("4. Rasathi");
				System.out.println("5. Oru poiyavathu Sol");
				System.out.println("Choose Your SONG : ");
				int song = sc.nextInt();
				if(song==1)
				{
					System.out.println("Playing Poongatrile");
				}
				else if(song==2)
				{
					System.out.println("Playing Marudaani");
				}
				else if(song==3)
				{
					System.out.println("Playing Minnalea En vazhvin");
				}
				else if(song==4)
				{
					System.out.println("Playing Rasathi");
				}
				else if(song==5)
				{
					System.out.println("Playing Oru poiyavathu Sol");
				}
				else
				{
					System.out.println("SORRY , YOUR SONG IS NOT AVAILABLE");
				}
			}
			else
			{
				System.out.println("SORRY , YOUR SONG TYPE IS NOT AVAILABLE");
			}
		}
		else
		{
			System.out.println("Your Artist is Not Available");

		}
	}
}	
			
				
					