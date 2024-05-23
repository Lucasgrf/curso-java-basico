package com.loiane.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Kratos");
        //contato.setEndereco("Olimpo");
        //contato.setTelefone("83 99999-9999");

        //relacionamento tem-um endereço.
        Endereco end = new Endereco();
        end.setNomeRua("Rua dos deuses");
        end.setNumero("n/a");
        end.setComplemento("Montanha mais alta");
        end.setCep("66666-66");
        end.setEstado("Grécia");
        end.setCidade("Olimpo");

        contato.setEndereco(end);

        //relacionamento tem-um telefone.
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("696");
        telefone.setNumero("96 96969-6969");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("969");
        telefone2.setNumero("69 69696-9696");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);


        System.out.println(contato.getNome());
        if(contato != null && contato.getEndereco() != null){
        System.out.println(contato.getEndereco().getCidade()); // código perigoso se feita sem verificação!
        }
        //System.out.println(contato.getTelefone());
        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
