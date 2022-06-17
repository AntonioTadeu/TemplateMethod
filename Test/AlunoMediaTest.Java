class AlunoMediaTest {

    @Test
    void deveRetonarAprovado() {
        AlunoMedia aluno = new AlunoMedia();
        aluno.setPresenca(> 9.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AlunoMedia aluno = new AlunoMedia();
        aluno.setNota1(< 9.0f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoEnsinoMedio aluno = new AlunoMedia();
        aluno.setPResenca(> 9.0f);
        aluno.setFalta(< 9.0f);
        aluno.setNome("Roberto");
        aluno.setChamada(13);
        assertEquals("Aluno{chamada=13, nome='Roberto', resultado=Reprovado}", aluno.getInfo());
    }
}