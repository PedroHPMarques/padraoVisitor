import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeVisitorTest {
    @Test
    void deveExibirTimeA() {
        TimeA timeA = new TimeA(5, 20, 2020);

        TimeVisitor visitor = new TimeVisitor();
        assertEquals("Time{posição='5', titulos'20', anoCriacao=2020}", visitor.exibir(timeA));
    }
    @Test
    void deveExibirTimeB() {
        TimeB timeB = new TimeB(1, 2, 2000);

        TimeVisitor visitor = new TimeVisitor();
        assertEquals("Time{posição='1', titulos'2', anoCriacao=2000}", visitor.exibir(timeB));
    }
    @Test
    void deveExibirTimeC() {
        TimeC timeC = new TimeC(18, 10, 1900);

        TimeVisitor visitor = new TimeVisitor();
        assertEquals("Time{posição='18', titulos'10', anoCriacao=1900}", visitor.exibir(timeC));
    }
}