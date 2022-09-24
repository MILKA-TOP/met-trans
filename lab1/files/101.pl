while (<>) {
  print if /^(\s|\S)*(cat)(\s|\S)*(cat)(\s|\S)*$/;
}
