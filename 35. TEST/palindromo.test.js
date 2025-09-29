const palindromo = require("./palindromo");

describe("PROBANDO PALINDROMO", () => {
  test("Camel Case", () => {
    expect(palindromo("Anita Lava La Ropa")).toBe(false);
  });

  test("Mayúsculas y minúsculas", () => {
    expect(palindromo("La ruta nos aportó otro paso natural")).toBe(true);
  });

  test("Frase que no es palíndroma", () => {
    expect(palindromo("Hoy hace un buen dia")).toBe(false);
  });
});
