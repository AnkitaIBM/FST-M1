player1 = str(input("what is player1 name? "))
player2 = str(input("what is player2 name? "))

while True:
    player1_choice = str(input(player1 + "do you want to choose rock or paper or scissors: ") . lower())
    player2_choice = str(input(player2 + "do you want to choose rock or paper or scissors: ") . lower())

    if player1_choice==player2_choice:
        print("Its a tie")
    elif player1_choice=='rock':
        if player2_choice=='scissors':
            print("rock beats scissors")
        else:
            print("paper beats rock")
    elif player1_choice=='scissors':
        if player2_choice=='paper':
            print("scissors beats paper")
        else:
            print("rock beats scissors")
    elif player1_choice=='paper':
        if player2_choice=='rock':
            print("paper beats rock")
        else:
            print("scissors beats paper")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeatgame = str(input("Do you want to repeat the game? ").lower())

    if repeatgame=='yes':
        pass
    elif repeatgame=='no':
        break;
    else:
        print("you have entered an invalid option, exiting now")
        break;