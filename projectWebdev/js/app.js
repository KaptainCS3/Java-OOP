// Wrap every letter in a span
var textWrapper = document.querySelector(".ml3");
textWrapper.innerHTML = textWrapper.textContent.replace(
  /\S/g,
  "<span class='letter'>$&</span>"
);

anime
  .timeline({ loop: true })
  .add({
    targets: ".ml3 .letter",
    opacity: [0, 1],
    easing: "easeInOutQuad",
    duration: 500,
    delay: (el, i) => 150 * (i + 1),
  })
  .add({
    targets: ".ml3",
    opacity: 0,
    duration: 500,
    easing: "easeOutExpo",
    delay: 500,
  });

//number input form validate

     const phoneInputField = document.querySelector("#phone");
     const phoneInput = window.intlTelInput(phoneInputField, {
       utilsScript:
         "https://cdnjs.cloudflare.com/ajax/libs/intl-tel-input/17.0.8/js/utils.js",
     });
     const info = document.querySelector(".alert-info");

     function process(event) {
       event.preventDefault();

       const phoneNumber = phoneInput.getNumber();

       info.style.display = "";
       info.innerHTML = `Phone number in E.164 format: <strong>${phoneNumber}</strong>`;
     }

     function getIp(callback) {
       fetch("https://ipinfo.io/json?token=<your token>", {
         headers: { Accept: "application/json" },
       })
         .then((resp) => resp.json())
         .catch(() => {
           return {
             country: "us",
           };
         })
         .then((resp) => callback(resp.country));
     }

