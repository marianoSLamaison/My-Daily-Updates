fetch('/Post/MostVisited')
  .then(response => response.json())
  .then(json => JSON.stringify(json) )
  .then(text => console.log(text))
  .catch(error => console.error('Error:', error));
