fruit_shop = { "apple" :50,
              "orange" :10,
              "pomegranate" : 25
              }

availablity_check = input("which fruit are you looking for: ").lower()
if availablity_check in fruit_shop:
    print("The fruit you are looking for is available")
else:
    print("The fruit you are looking for is not available")