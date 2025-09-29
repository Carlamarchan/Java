const pasarAMayusculas = require("./mayusculas"); //Aquí pilla el nombre del documento

describe("TEST PARA PASAR A MAYÚSCULAS", 
() => {
  test("Texto en minúsculas", () => {
    expect(pasarAMayusculas("destornillador")).toBe("DESTORNILLADOR");
  });

  test("Texto en Mayúsculas y minúsculas", () => {
    expect(pasarAMayusculas("CurioSeANdo")).toBe("CURIOSEANDO");
  });

  test("Texto con número y signos", () => {
    expect(pasarAMayusculas("Sept%/iembR$E")).toBe("SEPT%/IEMBR$E");
  });

  test("Tiene que dar error", () => {
    expect(pasarAMayusculas("hola mundo")).not.toBe("SEPT%/IEMBR$E");
  });
});
