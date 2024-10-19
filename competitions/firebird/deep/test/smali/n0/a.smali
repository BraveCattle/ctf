.class public abstract Ln0/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lm0/c;)Ln0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm0/c;",
            ":",
            "Lm0/l;",
            ">(TT;)",
            "Ln0/a;"
        }
    .end annotation

    new-instance v0, Ln0/b;

    move-object v1, p0

    check-cast v1, Lm0/l;

    invoke-interface {v1}, Lm0/l;->d()Lm0/k;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ln0/b;-><init>(Lm0/c;Lm0/k;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
