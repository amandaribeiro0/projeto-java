package movieSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import movieSort.model.Filmes;
import movieSort.model.Midia;
import movieSort.model.Series;
import movieSort.util.Cores;

public class Menu {
	private static List<Midia> filmesSorteados = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println(Cores.ANSI_WHITE_BACKGROUND + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("\t\t\t\t\t\t\t          ");
			System.out.println("  #     #                            #####                        ");
			System.out.println("  ##   ##  ####  #    # # ######    #     #  ####  #####  #####   ");
			System.out.println("  # # # # #    # #    # # #         #       #    # #    #   #     ");
			System.out.println("  #  #  # #    # #    # # #####      #####  #    # #    #   #     ");
			System.out.println("  #     # #    # #    # # #               # #    # #####    #     ");
			System.out.println("  #     # #    #  #  #  # #         #     # #    # #   #    #     ");
			System.out.println("  #     #  ####    ##   # ######     #####   ####  #    #   #     ");
			System.out.println("\t\t\t\t\t\t\t          ");

			System.out.println(Cores.TEXT_RESET);
			System.out.println("Bem Vindo ao Movie Sort!!!");
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Sortear Filme");
			System.out.println("2 - Sortear Série");
			System.out.println("3 - Listar ultimos sorteios");
			System.out.println("0 - Finalizar programa");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1 -> {
				System.out.println("Escolha o genero: \n");
				System.out.println("1 - Romance");
				System.out.println("2 - Terror");
				System.out.println("3 - Comédia");
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_YELLOW);
				int iiu = leia.nextInt();
				catalogoFilmes(iiu);
				System.out.println(Cores.TEXT_RESET);
				aguardarEnter();
				break;

			}
			case 2 -> {
				System.out.println("Escolha o genero: \n");
				System.out.println("1 - Romance");
				System.out.println("2 - Terror");
				System.out.println("3 - Comédia");
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_YELLOW);
				int iia = leia.nextInt();
				catalogoSeries(iia);
				System.out.println(Cores.TEXT_RESET);
				aguardarEnter();
				break;
			}
			case 3 -> {
				System.out.println("Os últimos filmes sorteados são: ");
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_YELLOW);
				for (Midia filme : filmesSorteados) {
					System.out.println(filme.toString());
				}
				System.out.println(Cores.TEXT_RESET);
				aguardarEnter();
				break;
			}
			case 0 -> {
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_RED);
				System.out.println("\nPrograma Finalizado!");
				System.exit(0);
			}

			}

		}
		leia.close();
	}

	public static void aguardarEnter() {
		System.out.println("\nPressione Enter para continuar...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public static void catalogoFilmes(int n) {

		/*
		 * Insira 1- romance, 2- terror 3- comedia Midia f# = new
		 * Series("Nome","Sinopse","atores",avaliação,ano de
		 * lançamento,genero,temporada);
		 */
		// Romances
		Midia f1 = new Filmes("PS Eu Te Amo.",
				"O filme conta a história de Garry, que morre por causa de uma doença e deixa sua esposa Holly sozinha. Ela descobre que ele havia deixado diversas cartas antes de partir, com o objetivo de ajudá-la em sua recuperação.",
				"Gerard Butler, Hilary Swank.", 7.0, 2008, 1, 2, 125);
		Midia f2 = new Filmes("Titanic.",
				"Um artista pobre e uma jovem rica se conhecem e se apaixonam na fatídica jornada do Titanic, em 1912. Embora esteja noiva de um arrogante herdeiro, a jovem desafia sua família em busca do verdadeiro amor.",
				"Kate Winslet, Leonardo DiCaprio.", 7.9, 1998, 1, 2, 194);
		Midia f3 = new Filmes("Your Eyes Tell.",
				"A jovem Akari tem sua vida transformada após um acidente em que perde os pais e a visão. Enquanto tenta se adaptar à nova rotina, ela conhece o ex-lutador Rui, que abandonou o mundo do crime e agora trabalha em um estacionamento.",
				"Ryūsei Yokohama,Yuriko Yoshitaka.", 7.3, 2020, 1, 2, 123);
		Midia f4 = new Filmes("O Segredo de BrokeBack Mountain.",
				"Jack Twist e Ennis del Mar, dois vaqueiros que cuidam de ovelhas nas montanhas durante o verão de 1963. Eles acabam estreitando a relação, desenvolvendo um romance.",
				"Jake Gyllenhaal, Heath Ledger, Anne Hathaway.", 7.7, 2005, 1, 2, 134);
		Midia[] midias1 = { f1, f2, f3, f4 };

		// Terror
		Midia f5 = new Filmes("A Entidade.",
				"Um escritor se muda para uma casa isolada com a família. Ao se deparar com imagens macabras, ele logo descobre que uma entidade maligna está colocando a vida de sua família em perigo.",
				"Ethan Hawke, Juliet Rylance.", 6.8, 2012, 2, 2, 110);
		Midia f6 = new Filmes("A Órfã.",
				"Um casal decide adotar uma criança, e durante uma visita a um orfanato, os dois se encantam por uma menina de nove anos e decidem adotá-la. Contudo, estranhos acontecimentos fazem parte do histórico da menina que passa a se tornar, dia após dia, mais misteriosa",
				"Isabelle Fuhrman, Vera Farmiga, Peter Sarsgaard", 7.0, 2009, 2, 2, 123);
		Midia f7 = new Filmes("Hereditário.",
				"Após a morte da avó, a família Graham começa a desvendar algumas coisas. Mesmo após a sua partida, ela permanece como se fosse uma sombra sobre a família, especialmente sobre a solitária neta adolescente.",
				"Toni Collette, Alex Wolff, Milly Saphiro.", 7.3, 2018, 2, 2, 126);
		Midia f8 = new Filmes("Babadook.",
				"Amelia, uma mãe solo atormentada pela violenta morte do marido, tenta lidar com o medo irracional do filho de que há um monstro à espreita na casa, mas logo descobre uma presença sinistra ao seu redor.",
				"Essie Davis, Noah Wiseman, Daniel Henshall.", 6.8, 2014, 2, 2, 93);

		Midia[] midias2 = { f5, f6, f7, f8 };

		// Comédias
		Midia f9 = new Filmes("Meninas Malvadas.",
				"Quando uma adolescente e sua família se mudam para os Estados Unidos, ela começa a frequentar a escola pública e recebe uma rápida introdução às leis de popularidade que dividem seus colegas.",
				"Lindsay Lohan, Rachel McAdams", 7.1, 2010, 3, 2, 97);
		Midia f10 = new Filmes("Minha Mãe É Uma Peça.",
				"Dona Hermínia (Paulo Gustavo) é uma mulher de meia idade, divorciada do marido. Ela não larga o pé de seus filhos Marcelina e Juliano, sem se dar conta que eles já estão bem grandinhos.",
				"Paulo Gustavo, Herson Capri, Mariana Xavier, Ingrid Guimarães.", 6.8, 2013, 3, 2, 84);
		Midia f11 = new Filmes("As Branquelas.",
				"Dois irmãos agentes do FBI são forçados a escoltar um par de garotas socialites a um final de semana cheio de glamour e festas. Quando as meninas descobrem o plano da agência, elas se recusam a ir. Sem opções, os dois se transformam em um par de loiras.",
				"Marlon Wayans, Shawn Wayans, Terry Crews.", 5.7, 2004, 3, 2, 109);
		Midia f12 = new Filmes("Superbad",
				"Os adolescentes Seth e Evan têm grandes esperanças para uma festa de formatura. Eles pretendem beber e conquistar as garotas para se tornarem mais populares na escola, mas a ansiedade de separação e dois policiais entediados complicam missão dos amigos.",
				"Jonah Hill, Seth Rogen, Emma Stone, Michael Cera.", 7.6, 2007, 3, 2, 119);
		Midia[] midias3 = { f9, f10, f11, f12 };

		Midia[] midiafilme;

		if (n == 1)
			midiafilme = midias1;
		else if (n == 2)
			midiafilme = midias2;
		else if (n == 3)
			midiafilme = midias3;
		else {
			midiafilme = null;
			System.out.println("Opção Invalida!");
		}
		Random rand = new Random();
		int index = rand.nextInt(midiafilme.length);

		filmesSorteados.add(midiafilme[index]);
		midiafilme[index].visualizar();

	}

	public static void catalogoSeries(int n) {

		/*
		 * Insira 1- romance, 2- terror 3- comedia Midia f# = new
		 * Series("Nome","Sinopse","atores",avaliação,ano de
		 * lançamento,genero,temporada);
		 */
		// Séries

		// Romance
		Midia s1 = new Series("Virgin River",
				" Determinada a começar do zero, a enfermeira Melinda Monroe (Alexandra Breckenridge) se muda de Los Angeles para a pequena cidade de Virgin River, também na Califórnia. Mas ela logo descobre que não vai ser nada fácil viver em um lugar tão remoto e rural.",
				" Alexandra Breckenridge Martin Henderson Tim Matheson", 7.4, 2019, 1, 1, 4);
		Midia s2 = new Series("Upload",
				"Em 2033, o playboy Nathan morre após sofrer um acidente de carro. Sua namorada então decide escolher uma nova vida para ele, mas virtual. Assim, ele começa a viver na mesma realidade da romântica Nora.",
				"Robbie Amell, Andy Allo, Allegra Edwards", 7.7, 2020, 1, 1, 2);
		Midia s3 = new Series("Bridgerton",
				"A série acompanha os oito irmãos da família Bridgerton na busca pelo amor, tendo como pano de fundo a alta sociedade londrina do início do século 19. Nesse mundo luxuoso, Daphne Bridgerton (Phoebe Dynevor) conhece o duque de Hastings (Regé-Jean Page), o solteiro mais requisitado da temporada.",
				"Jonathan Bailey, Simone Ashley, Charithra Chandran", 7.2, 2020, 1, 1, 2);
		Midia s4 = new Series("Love Life.",
				"E se pudéssemos percorrer toda a nossa história amorosa e relembrar tudo o que ocorreu até então? É o que esta série faz ao reviver todos os amores românticos da personagem principal, mostrando as idas e vindas e expressando todas as decepções enfrentadas. Love Life reflete sobre como os relacionamentos que vivemos acompanham a nossa própria história de vida.",
				"Anna Kendrick, Zoe Chao, Peter Vack", 7.5, 2020, 1, 1, 2);
		Midia[] midias4 = { s1, s2, s3, s4 };

		// Terror
		Midia s5 = new Series("Supernatural.",
				" Os irmãos Sam e Dean Winchester encaram cenários sinistros caçando monstros. Velhos truques, armas e esconderijos não funcionam mais e seus amigos os traem, forçando os irmãos a contar um com o outro enquanto enfrentam novos inimigos.",
				" Jared Padalecki, Jensen Ackles, Misha Collins.", 8.5, 2005, 2, 1, 15);
		;
		Midia s6 = new Series("The Walking Dead.",
				" Depois que um apocalipse zumbi se espalha pela cidade de Cynthiana, no Kentucky, o policial Rick Grimes (Andrew Lincoln) se une aos outros sobreviventes para combater os mortos-vivos e tentar encontrar uma solução para a situação.",
				" Norman Reedus, Melissa McBride, Lauren Cohan.", 8.9, 2010, 2, 1, 11);
		Midia s7 = new Series("American Horror Story",
				" American Horror Story é uma série antológica de terror. A cada temporada, o público é levado por universos aterrorizantes cheios de casos sobrenaturais e vilões macabros.",
				" Russell Tovey, Billie Lourd, Joe Mantello", 8.0, 2011, 2, 1, 11);
		Midia s8 = new Series("O Exorcista",
				" Dois homens muito diferentes dirigem seus esforços a um caso terrível de possessão demoníaca numa família local, e se veem cara a cara com o mal verdadeiro.",
				" Alfonso Herrera, Ben Daniels, Li Jun Li", 7.9, 2016, 2, 1, 2);
		Midia[] midias5 = { s5, s6, s7, s8 };

		// Comédia
		Midia s9 = new Series("Friends.",
				"Seis amigos, três homens e três mulheres, enfrentam a vida e os amores em Nova York e adoram passar o tempo livre na cafeteria Central Perk.",
				"Jennifer Aniston, Matthew Perry, Courteney Cox, Lisa Kudrow. ", 9.6, 1994, 3, 1, 10);
		Midia s10 = new Series("Os Simpsons.",
				"Homer é o pai de família nada saudável ou inteligente, que adora beber cerveja. Marge é a esposa e mãe dedicada. Bart é o filho de 10 anos, que não leva a escola a sério e tem orgulho disso. Lisa é a garota de oito anos, uma gênia não apreciada. E Maggie é o bebê que não larga a chupeta.",
				"Dan Castellaneta, Julie Kavner, Nancy Cartwright", 5.3, 1989, 3, 1, 34);
		Midia s11 = new Series("How I Met Your Mother.",
				"Tudo começou quando o melhor amigo de Ted, Marshall, soltou a bomba de que planejava pedir em casamento a namorada de longa data, Lily, uma professora de jardim de infância. Ted percebeu que era melhor se mexer se quisesse encontrar o verdadeiro amor. Para ajudá-lo na missão está Barney, um amigo com opiniões sem fim, e às vezes absurdas, uma queda por ternos e uma fórmula infalível para conhecer garotas.",
				"Josh Radnor, Neil Patrick Harris, Jason Segel, Alyson Hannigan.", 8.3, 2005, 3, 1, 9);
		Midia s12 = new Series("Only Murders In The Building",
				"A série conta a história de três estranhos que compartilham uma obsessão pelo gênero 'true crime' e que, de repente, se veem envolvidos em um crime na vida real. Quando uma morte horrível ocorre dentro de seu exclusivo prédio de apartamentos, o trio – formado por Mabel, Charles e Oliver – começa a suspeitar de assassinato e usa seu conhecimento para investigar o caso.",
				"Steve Martin, Selena Gomez, Martin Short.", 8.1, 2021, 3, 1, 2);

		Midia[] midias6 = { s9, s10, s11, s12 };

		Midia[] midias;
		if (n == 1)
			midias = midias4;
		else if (n == 2)
			midias = midias5;
		else if (n == 3)
			midias = midias6;
		else
			midias = midias4;

		Random rand = new Random();
		int index = rand.nextInt(midias.length);

		filmesSorteados.add(midias[index]);
		midias[index].visualizar();

	}
}