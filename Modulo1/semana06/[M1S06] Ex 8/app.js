async function gerarUsuarios(){
    const num = document.getElementById('num').value
    const users = await fetch(`https://randomuser.me/api/?results=${num}`)
    const usersJSON = await users.json()
    usersJSON.results.forEach(element => {
        let location = element.location
        let card = document.createElement('div')
        card.classList = 'card'
        card.style = 'width: 18rem;'
        card.innerHTML = `<img class="card-img-top" src="${element.picture.large}" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title">${element.name.title} ${element.name.first} ${element.name.last}</h5>
          <p class="card-text">${element.email}</p>
          <p class="card-text">${location.street.name} - ${location.street.number} - ${location.city} - ${location.state} - ${location.country}</p>
        </div>`
        document.getElementsByTagName('body')[0].appendChild(card)
    });
}

document.getElementById('gerar').addEventListener('click',gerarUsuarios)