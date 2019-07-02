def mymax(iterable, key = lambda x: x):
  # incijaliziraj maksimalni element i maksimalni ključ
  maxX=maxKey=None

  # obiđi sve elemente
  for x in iterable:
    # ako je key(x) najveći -> ažuriraj max_x i max_key
    if maxKey is None or key(x) > maxKey:
        maxX = x

  # vrati rezultat
  return maxX







"""
///////////////////////////////////////////////////////////////////////////
////            Glavni program
///////////////////////////////////////////////////////////////////////////
"""



maxInt = mymax([1, 3, 5, 7, 4, 6, 9, 2, 0])
maxChar = mymax("Suncana strana ulice")
maxString = mymax(["Gle", "malu", "vocku", "poslije", "kise",
                   "Puna", "je", "kapi", "pa", "ih", "njise"])
print("najveci integer je : ", maxInt)
print("najveci char je : ", maxChar)
print("najveci string je :", maxString)

D={'burek':8, 'buhtla':5}

maxDictionary = mymax(D, lambda x : D.get(x))

print("najveci u rijecnku je ", maxDictionary)

osobe = [("Filip", "Kovacevic"), ("Filip", "Kovacevici"), ("Filip", "Kovacevic"),
         ("Filip", "Kovacevicc")]

maxOsoba = mymax(osobe, lambda x: x[0] + " " + x[1])
print("najveca osoba je ", maxOsoba)





