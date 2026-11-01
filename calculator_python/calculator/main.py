import customtkinter as ctk
import re

app = ctk.CTk()
app.title("Calculator")
app.geometry("280x500")

box = ctk.CTkEntry(master=app, height=45, width=240, fg_color="transparent", justify="right",
                   font=("Bold", 30), text_color="White", border_width=0)
box.place(x=15, y=15)

result = ctk.CTkLabel(master=app, height=40, width=240, fg_color="transparent", anchor="e",
                      font=('Normal', 20), text_color="Grey", border_width=0, text="")
result.place(x=15, y=75)

clear_btn = ctk.CTkButton(master=app, text="C", fg_color="#FF7433",
                          height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: clear_input())
clear_btn.place(x=15, y=135)

delete_btn = ctk.CTkButton(master=app, text="D", fg_color="#FF7433",
                           height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: delete_input())
delete_btn.place(x=80, y=135)

persentage_btn = ctk.CTkButton(master=app, text="%", fg_color="#FF7433",
                               height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: insertnum("%"))
persentage_btn.place(x=145, y=135)

divide_btn = ctk.CTkButton(master=app, text="÷", fg_color="#FF7433",
                           height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: insertnum("/"))
divide_btn.place(x=215, y=135)

num7_btn = ctk.CTkButton(master=app, text="7",height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("7"))
num7_btn.place(x=15, y=210)

num8_btn = ctk.CTkButton(master=app, text="8", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("8"))
num8_btn.place(x=80, y=210)

num9_btn = ctk.CTkButton(master=app, text="9", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("9"))
num9_btn.place(x=145, y=210)

multiply_btn = ctk.CTkButton(master=app, text="x", fg_color="#FF7433",
                          height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: insertnum("*"))
multiply_btn.place(x=215, y=210)

num4_btn = ctk.CTkButton(master=app, text="4",height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("4"))
num4_btn.place(x=15, y=285)

num5_btn = ctk.CTkButton(master=app, text="5", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("5"))
num5_btn.place(x=80, y=285)

num6_btn = ctk.CTkButton(master=app, text="6", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("6"))
num6_btn.place(x=145, y=285)

minus_btn = ctk.CTkButton(master=app, text="-", fg_color="#FF7433",
                          height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: insertnum("-"))
minus_btn.place(x=215, y=285)

num1_btn = ctk.CTkButton(master=app, text="1",height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("1"))
num1_btn.place(x=15, y=360)

num2_btn = ctk.CTkButton(master=app, text="2", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("2"))
num2_btn.place(x=80, y=360)

num3_btn = ctk.CTkButton(master=app, text="3", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("3"))
num3_btn.place(x=145, y=360)

plus_btn = ctk.CTkButton(master=app, text="+", fg_color="#FF7433",
                          height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: insertnum("+"))
plus_btn.place(x=215, y=360)

mode_btn = ctk.CTkButton(master=app, text="𖤓",height=40, width=40, fg_color="transparent",
                         font=('Bold', 30), corner_radius=8, command=lambda: theme_change())
mode_btn.place(x=10, y=435)

num0_btn = ctk.CTkButton(master=app, text="0", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("0"))
num0_btn.place(x=80, y=435)

dot_btn = ctk.CTkButton(master=app, text=".", height=40, width=40,
                         font=('Bold', 30), corner_radius=8, command=lambda: insertnum("."))
dot_btn.place(x=145, y=435)

equal_btn = ctk.CTkButton(master=app, text="=", fg_color="#FF7433",
                          height=40, width=40, font=('Bold', 30), corner_radius=8, command=lambda: equal_func())
equal_btn.place(x=215, y=435)


def insertnum(n):
    box.insert(ctk.INSERT, str(n))
    display_result()

def display_result():

    try:
        cal = box.get()

        if re.search(pattern=r'[\+\-\*\%\/]', string=cal):
            res = eval(cal)
            result.configure(text=f"= {res}")
        else:
            result.configure(text="")
    except Exception as e:
        print(e)

def delete_input():
    indx = box.index(ctk.INSERT) -1
    box.delete(indx)
    display_result()

def clear_input():
    box.delete(0, ctk.END)
    result.configure(text="")
    box.configure(font=('Bold', 30))
    result.configure(font=('Bold', 20))


def equal_func():
    box.configure(font=('Bold', 18))
    result.configure(font=('Bold', 30))

def theme_change():
    if ctk.get_appearance_mode() == "Dark":
        ctk.set_appearance_mode("Light")
        mode_btn.configure(text="🌙")
        box.configure(text_color="Black")
    else :
        ctk.set_appearance_mode("Dark")
        mode_btn.configure(text="𖤓")
        box.configure(text_color="White")


app.mainloop()
