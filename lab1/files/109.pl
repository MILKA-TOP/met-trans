
while (<>) {
  print if /(^(\S)(\s|\S)*\S$)|(^(\S)*$)/;
}
