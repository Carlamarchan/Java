const suma = require("./suma");

describe("PROBANDO DISTINTOS VALORES DE SUMA",
  () => {
    test("2+2 es igual a 4", () => {
      expect(suma(2, 2)).toBe(4);
    });

    test("2+20 es igual a 22", () => {
      expect(suma(2, 20)).toBe(22);
    });

    test("0+0 es igual a 0", () => {
      expect(suma(0, 0)).toBe(0);
    });

    test("-2+20 es igual a 18", () => {
      expect(suma(-2, 20)).toBe(18);
    });

    test("probando con caracteres", () => {
      expect(suma("Hola ", "Mundo")).toBe("Hola Mundo");
    });

    test("Número y texto", () => {
      expect(suma(500, " dólares")).toBe("500 dólares");
    });
  });
