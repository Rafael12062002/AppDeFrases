package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GerarNovaFrase(View view){
        String[] frasesAnime = {
                "Será que alguém precisa de motivos, para proteger suas próprias crianças. (Adão, Record Of Ragnarok)",
                "você pode passar a vida toda de joelhos, mas no momento de sua morte precisa estar de pé. (Yamamoto, Bleach)",
                "Tatakae kkkk (Eren, Atack on Titan)",
                "Para conhecer a verdadeira paz, precissamos conhecer a verdadeira dor. (Pain, Naruto)",
                "Está tudo bem, sabe porquê? Porque eu estou aqui. (All Might, Boku no Hero)",
                "Não desista, não há vergonha em cair! A verdadeira vergonha é não se levantar novamente. (shintaro, Kuroko no Basket)",
                "Você pode morrer a qualquer momento, mas viver requer coragem. (Kenshi Himura, Ruroini Kenshin)",
                "A vida não é um jogo de sorte. Se quer vencer, trabalhe duro. (Ahiru no Sora)",
                "Lembre-se da lição e não da decepção. (Holo The Wise Wolf, Spice and Wolf",
                "Você não conhece as pessoas, você conhece apenas o que elas permitem que você veja. (Bleach)",
                "É mais importante dominar as cartas que você tem nas mãos do que reclamar das cartas que seu oponente recebeu, (Grimsley, Pokémon)",
                "Se você não gosta do seu destino, não o aceite. Em vez disso, tenha a coragem para transformá-lo naquilo que você quer que ele seja. (Naruto Uzumaki, Naruto)",
                "Se a sua vida pode mudar uma vez, ela pode mudar novamente.(Sanae)",
                "Você jamais deve desistir da vida, não importa o que aconteça. Não importa o quanto você queira desistir. (Canaan)",
                "Se você não consegue fazer algo, então não faça. Foque naquilo que consegue fazer. (Shiroe, Log Horizon)",
                "O mundo não é perfeito. Mas ele está aqui para nós, fazendo o melhor que pode... e é isso que o faz tão lindo! (Roy Mustang, Full Metal Alchemist)",
                "O que quer que você perca, você encontrará novamente. Mas aquilo que jogar fora, você nunca terá de volta. (Kenshin Himura, Rurouni Kenshin)",
                "As pessoas fortes não derrubam as outras, elas ajudam-nas a se erguerem. (Goku, Dragon Ball Z)",
                "Somente aqueles que sofreram por muito tempo conseguem ver luz através das sombras. (Roronoa Zoro, One Piece)",
                "Feridas em seu coração são diferentes de feridas em seu corpo e existe apenas uma coisa que pode curá-las: o amor. (Naruto Uzumaki, Naruto)",
                "Não importa o quão poderoso você se torne, nunca tente fazer tudo sozinho. Caso contrario irá falhar. (Uchiha Itachi, Naruto)",
                "Posso não ter crescido nem um centímetro, mas não vou deixar que o meu coração fique pequeno para sempre! (Edward, Full Metal Alchemist)",
                "Mesmo que nós esqueçamos os rostos dos nossos amigos, jamais esqueceremos os laços que foram cravados nas nossas almas. (Otonashi Yuzuru, Angel Beats)",
                "Você não é derrotado quando perde, mas sim quando você desiste. (Vegeta, Dragon Ball Z)",
                "Há momentos que você precisa desistir de alguma coisa para preservar a outra. (Rize, Tokyo Ghoul)",
                "Se você aceita tudo sem ao menos questionar, vai acabar perdendo a capacidade de pensar. (Pandora Hearts)",
                "As palavras são como flechas. Depois que são lançadas, não tem como voltar atrás. (Shida Uryuu, Bleach)",
                "Não viva com falsidades ou medos, porque você acabará se odiando. (Uzumaki Naruto)",
                "Não importa para mim se os deuses existem ou não, eu sou o mestre da minha vida; Eu passo em questões religiosas, mas nunca desprezarei alguém que acredite nelas. (Roronoa Zoro)",
                "Não importa o quão habilidoso você seja, você sozinho não pode mudar o mundo. Mas essa é a coisa maravilhosa sobre o mundo. (L)",
                "Se as pessoas acreditam em tudo que ouvem, então não há diferença entre a mentira e a verdade. (Kuroshitsuji)",
                "O que é importante não é o que os outros pensam de você, mas como você age perante a isso. (Nanatsu no Taizai)",
                "Dor, tristeza e alegria... esses sentimentos permitem que você entenda os outros. (Naruto)",
                "Cometemos muitos erros, embora o que possamos fazer é aprender com eles e nos esforçarmos para que não sejam repetidos. (Assassination Classroom)",
                "Às vezes as questões são complicadas e as respostas são simples. (Death Note)",
                "A raiva bloqueia o raciocínio de momentos que deveríamos agir com inteligência. (Yu-Gi-Oh!)",
                "Então, nunca deixe de sonhar e diga pra si mesmo que deve acreditar. Lembre-se, o mundo não vai parar pra que você possa se lamentar. (Naruto Shippuden)",
                "Como eu poderia viver feliz esquecendo da pessoa de quem mais gosto? (Makimachi Misao)",
                "Sacrificar sua felicidade pela felicidade de quem se ama, é de longe o mais puro tipo de amor. (Naruto Shippuden)",
                "Cada um de nós tem sua própria vida para viver. É uma jornada, não uma separação. É um começo, não um fim. Vai ser um pouco solitária, mas é assim que as coisas são. (Samurai X)",
                "Quando chegar a hora… eu desejo apenas estar preparada para aceitar suas dificuldades… não importa quais sejam. (Fruits Basket)",
                "Nenhum ser humano na sociedade deveria ser considerado menos valioso que o outro. (Samurai X)",
                "Impossível é uma palavra que as pessoas inventaram para se sentir melhor quando desistem de algo. (Tengen Toppa Gurren-Lagann)",
                "Não se esqueça que algum dia você irá morrer, e isso é mais uma razão para viver o agora. (Death Parade)",
                "Toda irregularidade no mundo é consequência da falta de atitude de alguém. (Tokyo Ghoul)",
                "Quando você ama, há o risco de odiar. (Naruto)",
                "Quando decidi seguir meu sonho, eu já tinha descartado minha vida. (Roronoa Zoro)",
                "Pesadelos não duram para sempre. Um dia você acorda e eles se foram. (Dragon Ball)",
                "Se você está vivo pode recomeçar. Ninguém tem o direito de te tirar isso. (Death Note)",
                "Escute a voz de Deus e siga-a, saiba que com o tempo vai encontrar sua salvação. (Death Note)",
                "Daqui pra frente vai ser uma solidão.....eu e você vamos nos separar em breve. (Death Note)"//50
                };


        TextView texto = findViewById(R.id.Frase);
        int numero = new Random().nextInt(50);
        texto.setText(frasesAnime[numero]);
    }

}