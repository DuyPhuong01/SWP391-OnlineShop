<%-- 
    Document   : createnewpassword
    Created on : Jun 11, 2022, 9:41:44 PM
    Author     : tretr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8" />
        <title>Create new password</title>
        <link rel="stylesheet" href="css/stylelogin.css" />

        <link
            rel="stylesheet"
            href="https://unicons.iconscout.com/release/v4.0.0/css/line.css"
            />

        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    </head>
    <body>
        <div class="overlay-login" id="divTwo">
            <div class="wrapper-login">
                <a class="close" href="#a" id="close">&times;</a>
                <div class="title signup"style="width: 100%;">New password
                
                <p>Enter your new password</p>
                </div>
                <div class="form-container">
                    <div class="form-inner">
                        <form action="resetpass" method="POST" class="signup">
                            <p class="text-danger">${requestScope.mess}</p>
                            <input type="hidden" name="email" value="${sessionScope.account.getEmail()}"/>
                            <div class="input-box">
                                <input
                                    class="p-inputtt"
                                    name="pass"
                                    type="password"
                                    spellcheck="false"
                                    required
                                    />
                                <label for="">Password</label>
                                <i class="uil uil-eye-slash toggleee"></i>
                            </div>

                            <div class="input-box">
                                <input
                                    class="p-inputttt"
                                    name="repass"
                                    type="password"
                                    spellcheck="false"
                                    required
                                    />
                                <label for="">Comfirm Password</label>
                                <i class="uil uil-eye-slash toggleeee"></i>
                            </div>
                            <div class="field btn">
                                <div class="btn-layer"></div>
                                <input type="submit" value="Change"/>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script>
            
            const toggleee = document.querySelector(".toggleee"),
                    inputtt = document.querySelector(".p-inputtt");
            const toggleeee = document.querySelector(".toggleeee"),
                    inputttt = document.querySelector(".p-inputttt");
            toggleee.addEventListener("click", () => {
                if (inputtt.type === "password") {
                    inputtt.type = "text";
                    toggleee.classList.replace("uil-eye-slash", "uil-eye");
                } else {
                    toggleee.classList.replace("uil-eye", "uil-eye-slash");
                    inputtt.type = "password";
                }
            });
            toggleeee.addEventListener("click", () => {
                if (inputttt.type === "password") {
                    inputttt.type = "text";
                    toggleeee.classList.replace("uil-eye-slash", "uil-eye");
                } else {
                    toggleeee.classList.replace("uil-eye", "uil-eye-slash");
                    inputttt.type = "password";
                }
            });
            
        </script>
    </body>
</html>
