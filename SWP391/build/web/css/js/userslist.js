/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const toggle1 = document.querySelector(".toggle1"),
        input1 = document.querySelector(".p-input1");
const toggle2 = document.querySelector(".toggle2"),
        input2 = document.querySelector(".p-input2");
toggle1.addEventListener("click", () => {
    if (input1.type === "password") {
        input1.type = "text";
        toggle1.classList.replace("uil-eye-slash", "uil-eye");
    } else {
        toggle1.classList.replace("uil-eye", "uil-eye-slash");
        input1.type = "password";
    }
});

toggle2.addEventListener("click", () => {
    if (input2.type === "password") {
        input2.type = "text";
        toggle2.classList.replace("uil-eye-slash", "uil-eye");
    } else {
        toggle2.classList.replace("uil-eye", "uil-eye-slash");
        input2.type = "password";
    }
});
function myFunction(id) {
    let text = "Do you want to delete account?\n OK or Cancel.";
    if (confirm(text) === true) {
        window.location.href = 'admindeleteuser?id=' + id;
    } else {
        window.location.href = 'userslist';
    }
}