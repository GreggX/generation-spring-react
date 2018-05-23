'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class ReactApp extends React.Component {
    constructor(props) {
        super(props);
        this.state = {tiendas: []};
    }

    componentDidMount(){
        client({method: 'GET', path: '/api/tiendas'}).done(response => {
            this.setState({tiendas: response.entity._embedded.tiendas});
        });
    }

    render() {
        return (
            <ListaTienda tiendas={this.state.tiendas}/>
        )
    }
}

class ListaTienda extends React.Component {
    render() {
        var tiendas = this.props.tiendas.map(tienda =>
            <Tienda key={tienda._links.self.href} tienda={tienda} />
        );
        return (
            <table>
                <tbody>
                    <tr>
                        <th>Nombre</th>
                        <th>Categoria</th>
                        <th>Direccion</th>
                        <th>Numero Empleados</th>
                        <th>Telefono</th>
                    </tr>
                    {tiendas}
                </tbody>
            </table>
        )
    }
}

class Tienda extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.tienda.nombre}</td>
                <td>{this.props.tienda.categoria}</td>
                <td>{this.props.tienda.direccion}</td>
                <td>{this.props.tienda.noEmpleados}</td>
                <td>{this.props.tienda.noTelefono}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <ReactApp/>,
    document.getElementById('react')
)