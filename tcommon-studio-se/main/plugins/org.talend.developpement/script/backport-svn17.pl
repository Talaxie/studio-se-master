#!/usr/bin/perl

use strict;
use warnings;

use Data::Dumper;
use Term::Prompt;
use File::Path;

# set English locale
$ENV{'LANG'} = "en_US.utf8";
$ENV{'LC_ALL'}="en_US.utf8";

my $svncommand = "/usr/bin/svn";


#check svn version
my $svnversioncommand = $svncommand." --version";
my $svnversioncommandoutput = `$svnversioncommand`;
my $svnmergeaddparams = "";
if ( $svnversioncommandoutput =~ m/version 1.4/ ) {
    #nothing to do
} elsif ( $svnversioncommandoutput =~ m/version 1.[567]/ ) {
    $svnmergeaddparams = "--depth infinity";
} else {
    die "this script only supports 1.4 to 1.7 versions of svn ";
}

my $logfile = "/tmp/svnmergelog.".$$;
my $rootpath = "/tmp/svnmerge.".$$;

my $rooturl = "http://talendforge.org/svn";

sub usage {
	print "backport 123 456 ... from x.x/trunk to x.x/trunk\n";
}

if (scalar @ARGV == 0) {
	usage;
	exit 0;
}

#parse arguments
my @revs;
my $from = "";
my $fromurl;
my $to = "";
my $tourl;

my $type = 0; #0 collect revs / 1 collect from / 2 collect to

for my $arg(@ARGV) {
    if ($type == 0) {
       if ($arg =~ m/^(\d+)$/) {
	   push @revs, $arg;
       } elsif ($arg eq "from") {
	   $type = 1;
       } else {
	   usage;
	   die $arg." is not a revision number";
       }
   } elsif ($type == 1) {
       if ($arg eq "trunk") {
	   $from = $arg;
	   $fromurl = $from;
       } elsif ($arg =~ m/^(\d+)\.(\d+)$/) {
	   $from = "branch ".$1.".".$2;
	   $fromurl = "branches/branch-".$1."_".$2;
       } elsif ($arg =~ m/^(\d+)\.(\d+)\.(.*)$/) {
	   $from = "branch ".$1.".".$2.".".$3;
	   $fromurl = "branches/branch-".$1."_".$2."_".$3;
       } elsif ($arg eq "to") {
	   $type = 2;
       } else {
	   usage;
	   die $arg." must be x.x or x.y.z or or trunk";
       }
   } elsif ($type == 2) {
       if ($arg eq "trunk") {
	   $to = $arg;
	   $tourl = $to;
       } elsif ($arg =~ m/^(\d+)\.(\d+)$/) {
	   $to = "branch ".$1.".".$2;
	   $tourl = "branches/branch-".$1."_".$2;
       } elsif ($arg =~ m/^(\d+)\.(\d+)\.(.*)$/) {
	   $to = "branch ".$1.".".$2.".".$3;
	   $tourl = "branches/branch-".$1."_".$2."_".$3;
       } else {
	   usage;
	   die $arg." must be x.x or x.y.z or trunk";
       }
   }
}

if (scalar @revs == 0 ) {
    usage;
    die "you must provide at least one revision number";
}

if (length $from == 0 ) {
    usage;
    die "you must provide a from clause";
}

if (length $to == 0 ) {
    usage;
    die "you must provide a to clause";
}

if ($to eq $from) {
    usage;
    die "from and to must be different";
}

#do merge
for my $rev (@revs) {
    #log
    my $msglogcommand = $svncommand." log -r".$rev." ".$rooturl;
    my $msglog = `$msglogcommand`;
    my @msgloglines = split("\n", $msglog);
    open(LOGFILE, ">", $logfile) || die "cannot open file $logfile";
    print LOGFILE "merge r".$rev." from ".$from." to ".$to."\n";
    #don't care of three first lines and last line
    for(my $i = 3 ; $i < scalar @msgloglines - 1 ; $i++) {
	print LOGFILE $msgloglines[$i], "\n";
    }
    close(LOGFILE);

    #modified files
    my $pathlogcommand = $svncommand." log --xml -v -r".$rev." ".$rooturl;
    my @files;
    my $pathlog = `$pathlogcommand`;
    while($pathlog =~ m{<path[^>]+>([^<]+)</path>}g) {
	push @files, $1;
    }

    #compute destination files
    for my $file (@files) {
	$file =~ s/$fromurl/$tourl/;
    }
    
    #checkout root
    unless(-d $rootpath) {
	my $checkoutcommand = $svncommand." checkout -N ".$rooturl." ".$rootpath;
	print $checkoutcommand, "\n";
	system $checkoutcommand;
    }

    #update non recursive on needed childs
    for my $file (@files) {
	my @segments = split("/", $file);
	
	my %paths;
	my $path = "";
	for(my $i = 0 ; $i < scalar @segments ; $i++) {
	    $path = $path.$segments[$i];
	    unless(-e $rootpath.$path) {
		my $svncheckoutcommand;
		if ( $svnversioncommandoutput =~ m/version 1.7/ ) {
		    $svncheckoutcommand = $svncommand." up -N ".$rootpath.$path;
		} else {
		    $svncheckoutcommand = $svncommand." up -N ".$rooturl.$path." ".$rootpath.$path;
		}
		print $svncheckoutcommand, "\n";
		system $svncheckoutcommand;
	    }
	    $paths{path}++;
	    $path = $path."/";
	}
    }

    #find relevants reps
    my %reps;
    for my $file (@files) {
	if ($file =~ m{([^/]+)/}) {
	    $reps{$1}++;
	}
    }    

    #merge
    print "\n--------------------------------------------------\n\n";
    my @mergecommands;
    for my $rep (keys %reps) {
	push @mergecommands, $svncommand." merge ".$svnmergeaddparams." -c".$rev." ".$rooturl."/".$rep."/".$fromurl." ".$rootpath."/".$rep."/".$tourl;
    }
    
    for my $mergecommand (@mergecommands) {
	print $mergecommand, "\n";
	system $mergecommand;
    }

    #what to do
    my $continue = 1;
    while ($continue == 1) {
	print "\n--------------------------------------------------\n\n";
	my $result = &prompt("a", "log/commit/status/revert/merge again/diff/kompare/quit ?", "l/c/s/r/m/d/k/q", "s" );

	if ($result eq "c") {
	    #commit
	    my $svncommitcommand = $svncommand." commit -F ".$logfile." ".$rootpath;
	    print $svncommitcommand, "\n";
	    system $svncommitcommand;
	    $continue = 0;
	} elsif ($result eq "s") {
	    my $statuscommand = $svncommand." status ".$rootpath;
	    print $statuscommand, "\n";
	    system($statuscommand);
	} elsif ($result eq "r") {
	    my $revertcommand = $svncommand." revert -R ".$rootpath;
	    print $revertcommand, "\n";
	    system($revertcommand);
	} elsif ($result eq "m") {
	    for my $mergecommand (@mergecommands) {
		print $mergecommand, "\n";
		system $mergecommand;
	    }
	} elsif ($result eq "q") {
	    exit 0;
	} elsif ($result eq "l") {
            print "\n--------------------------------------------------\n";
            open(my $logfile_ifh, "<", $logfile) || die "cannot open file $logfile for reading";
            while (<$logfile_ifh>) {
                print $_;
            }
            close($logfile_ifh);
            print "--------------------------------------------------\n\n";
	} elsif ($result eq "d") {
	    my $diffcommand = $svncommand." diff ".$rootpath;
	    print $diffcommand, "\n";
	    system($diffcommand);
	} elsif ($result eq "k") {
	    my $diffcommand = $svncommand." diff ".$rootpath." | kompare -";
	    print $diffcommand, "\n";
	    system($diffcommand);
        }
    }

    print "\n--------------------------------------------------\n\n";
}

rmtree($rootpath);
