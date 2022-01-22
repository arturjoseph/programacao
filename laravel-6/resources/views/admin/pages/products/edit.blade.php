@extends('admin.layouts.app')
@section('title','Edição de Produto')
@section('content')
    <h1>Cadastrar novo produto</h1>
        @include('admin.includes.alerts')

    <form action="{{route('products.update', $product->id)}}" method="post" enctype="multipart/form-data" class="form">
        @csrf
        @method('PUT')
        <div class="form-group">
            <input class="form-control" type="text" name="name" placeholder="Maria" value="{{ $product->name }}">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="description" placeholder="Sou da Bahia" value="{{ $product->description}}">
        </div>
        <div class="form-group">
            <input class="form-control" type="text" name="price" placeholder="R$10,00" value="{{ $product->price }}">
        </div>
        <div class="form-group">
            <input class="form-control" type="file" name="image"  >
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-success">Salvar</button>
        </div>

    </form>
@endsection
